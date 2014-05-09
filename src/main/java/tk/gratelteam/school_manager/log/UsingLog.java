/*
 * ©2014 Gratel Team.
 * Anybody can modify that things 
 * BUT NOT CHANGE GENERAL THINGS.
 * and this project is under the LGPL3.
 * (http://www.gnu.org/licenses/lgpl.html)
 */

package tk.gratelteam.school_manager.log;
import tk.gratelteam.school_manager.log.Logger;
/**
 *
 * @author 陈濯
 */
public interface UsingLog {
    public org.apache.logging.log4j.Logger l= Logger.getLogger();
    public org.apache.logging.log4j.Logger getLogger();
}
class UseLog{
    UsingLog u=() -> UsingLog.l;
}
