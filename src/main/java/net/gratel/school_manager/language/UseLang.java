/*
 * ©2014 Gratel Team.
 * Anybody can modify that things 
 * BUT NOT CHANGE GENERAL THINGS.
 * and this project is under the LGPL3.
 * (http://www.gnu.org/licenses/lgpl.html)
 */

package net.gratel.school_manager.language;


import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.IOUtils;

/**
 *
 * @author 陈濯
 */
public class UseLang implements net.gratel.school_manager.api.LanguageAPI{
private static Properties p;
    @Override
    public void setProperties(Properties p) {
        this.p=p;
    }

    /**
     *
     * @return LangProperties
     */
    public Properties getProperties(){return p;}
    
    public static Properties getProperties(Object nll) {
    try {
        Properties lang=new Properties();
        lang.load(IOUtils.toInputStream(p.getProperty("lang")));
        return lang;
    } catch (IOException ex) {
        Logger.getLogger(UseLang.class.getName()).log(Level.SEVERE, null, ex);
    }
    return p;
    }
    
}
