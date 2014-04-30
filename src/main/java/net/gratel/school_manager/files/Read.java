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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author 陈濯
 */
public class Read {
    public static List<String> ReadFromFile(String file){
        try {
            List<String> list=FileUtils.readLines(new File(file));
            List<String> noklist=new ArrayList<>();
            int size=list.size()-1;
            for(int i=0;i<=size;i++){
                noklist.add(list.get(i).trim());
            }
            return noklist;
        } catch (IOException ex) {
            Logger.getLogger(Read.class.getName()).log(Level.SEVERE, null, ex);
            ArrayList<String> error=new ArrayList<>();
            error.add("Read Failed!");
            return error;
        }
    }
}
