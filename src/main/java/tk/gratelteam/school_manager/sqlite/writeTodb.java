/*
 * ©2014 Gratel Team.
 * Anybody can modify that things 
 * BUT NOT CHANGE GENERAL THINGS.
 * and this project is under the LGPL3.
 * (http://www.gnu.org/licenses/lgpl.html)
 */

package tk.gratelteam.school_manager.sqlite;

import tk.gratelteam.school_manager.log.UsingLog;

/**
 *
 * @author 陈濯
 */
public class writeTodb {

    /**
     *
     * @param tb
     * @param user
     * @param password
     * @param obj
     */
    
    public static void writeTodb(String tb,String user,String password,Object...obj){
        StringBuilder s=new StringBuilder();
        
        
        for(Object o:obj){
            s.append('\'').append(obj.toString()).append("\',");
        }
        Dao.excuteSql("INSERT TO "+tb+" VALUES("+s.toString(), user, password);
    }
}
