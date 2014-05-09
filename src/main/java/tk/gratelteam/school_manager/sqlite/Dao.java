/*
 * ©2014 Gratel Team.
 * Anybody can modify that things 
 * BUT NOT CHANGE GENERAL THINGS.
 * and this project is under the LGPL3.
 * (http://www.gnu.org/licenses/lgpl.html)
 */

package tk.gratelteam.school_manager.sqlite;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 陈濯
 */
public class Dao {
    private Dao(){}
    public static Connection getCon(String user,String password){
        Connection con=null;
        try {
            Class.forName("org.sqlite.JDBC");
            File file=new File("school.db");
            if(file.exists()){
                con=DriverManager.getConnection("jdbc:sqlite:school.db", user,password);
            }else{
                file.createNewFile();
                con=DriverManager.getConnection("jdbc:sqlite:school.db", user,password);
            }
        } catch (ClassNotFoundException | SQLException | IOException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return con;
    }
    public static ResultSet excuteSql(String sql,Connection con){
        try {
            Statement s = con.createStatement();
            return s.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public static ResultSet excuteSql(String sql,String user,String password){
        try {
            Statement s = getCon(user,password).createStatement();
            return s.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
