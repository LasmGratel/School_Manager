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
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
/**
 *
 * @author 陈濯
 */
public class UseLang implements net.gratel.school_manager.api.LanguageAPI{
private Properties p=new Properties();
    Logger logger=LogManager.getLogger("[STDERR]");
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
        p.load(IOUtils.toInputStream("settings.properties","UTF-8"));
    } catch (IOException ex) {
        logger.error(ex.getMessage());
    }
    
        Properties lang=new Properties();
        lang.load(IOUtils.toInputStream(p.getProperty("language")+".properties","UTF-8"));
        return lang;
    } catch (IOException ex) {
        logger.error(ex.getMessage());
    }
    return p;
    }
    
}
