/*
 * ©2014 Gratel Team.
 * Anybody can modify that things 
 * BUT NOT CHANGE GENERAL THINGS.
 * and this project is under the LGPL3.
 * (http://www.gnu.org/licenses/lgpl.html)
 */

package net.gratel.school_manager.language;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
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
private Properties p=new Properties();
    
    /**
     *
     * @param p
     */
    @Override
    public void setProperties(Properties p) {
        this.p=p;
    }

    /**
     *
     * @return LangProperties
     */
@Override
    
    
    public Properties getProperties() {
    try {
       
    try {
        p.load(new FileInputStream(new File("settings.properties")));
    } catch (IOException ex) {
        Logger.getLogger(UseLang.class.getName()).log(Level.SEVERE, null, ex);
    }
    
        Properties lang=new Properties();
        lang.load(new FileInputStream(new File(p.getProperty("language")+".properties")));
        return lang;
    } catch (IOException ex) {
        Logger.getLogger(UseLang.class.getName()).log(Level.SEVERE, null, ex);
    }
    return p;
    }
    
}
