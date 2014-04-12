/*
 * ©2014 Gratel Team.
 * Anybody can modify that things 
 * BUT NOT CHANGE GENERAL THINGS.
 * and this project is under the LGPL3.
 * (http://www.gnu.org/licenses/lgpl.html)
 */

package net.gratel.school_manager.language;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import net.gratel.school_manager.exception.PropertiesException;

/**
 *
 * @author 陈濯
 */
public class FrameLang implements net.gratel.school_manager.api.LanguageAPI{
    private Properties p;
    @Override
    public void setProperties(Properties p) {
        this.p=p;
    }

    @Override
    public Properties getProperties() {
        return p;
    }
    public String toString(int value){
        List<String> list=new ArrayList<>();
        UseLang.getProperties("");
    }
    
}
