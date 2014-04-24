/*
 * ©2014 Gratel Team.
 * Anybody can modify that things 
 * BUT NOT CHANGE GENERAL THINGS.
 * and this project is under the LGPL3.
 * (http://www.gnu.org/licenses/lgpl.html)
 */

package net.gratel.school_manager.yaml;

import java.io.IOException;

import net.gratel.school_manager.Classes.School;
import org.apache.commons.io.IOUtils;
import net.gratel.school_manager.log.Logger;
import org.ho.yaml.Yaml;

/**
 *
 * @author 陈濯
 */
public class Load {
    public static School LoadFromFile(String file) {
        try {
            return (School)Yaml.load(IOUtils.toInputStream(file, "UTF-8"));
        } catch (IOException ex) {
            Logger.getLogger().error(ex.getMessage());
        }
        return new School();
    }
}
