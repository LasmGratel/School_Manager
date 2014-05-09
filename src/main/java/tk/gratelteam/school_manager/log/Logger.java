/*
 * ©2014 Gratel Team.
 * Anybody can modify that things 
 * BUT NOT CHANGE GENERAL THINGS.
 * and this project is under the LGPL3.
 * (http://www.gnu.org/licenses/lgpl.html)
 */

package tk.gratelteam.school_manager.log;
import org.apache.logging.log4j.LogManager;
/**
 *
 * @author 陈濯
 */
public class Logger {
    public static org.apache.logging.log4j.Logger getLogger(){
        return LogManager.getLogger();
    }
}
