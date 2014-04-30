/*
 * ©2014 Gratel Team.
 * Anybody can modify that things 
 * BUT NOT CHANGE GENERAL THINGS.
 * and this project is under the LGPL3.
 * (http://www.gnu.org/licenses/lgpl.html)
 */

package net.gratel.school_manager.files;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.FileUtils;
/**
 *
 * @author 陈濯
 */
public class Write {
    
    public static void WriteToFile(String file,List<String> line){
        try {
            if(new File(file).exists()){
                System.out.println("Writeing...");
                FileUtils.writeLines(new File(file), "UTF-8", line);
            }else{
                new File(file).createNewFile();
                WriteToFile(file,line);
            }
        } catch (IOException ex) {
            Logger.getLogger(Write.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
