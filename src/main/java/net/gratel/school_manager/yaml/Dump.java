/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.gratel.school_manager.yaml;

/**
 *
 * @author 陈濯
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.ho.yaml.Yaml;
import org.ho.yaml.YamlEncoder;
public class Dump {
    public void dump(File file,Object todump) throws IOException{
        try {
            if(file.exists()){
            YamlEncoder enc = new YamlEncoder(new FileOutputStream(file));
            Yaml.dump(todump, file, true);
            }else{
                file.createNewFile();
                YamlEncoder enc = new YamlEncoder(new FileOutputStream(file));
                            Yaml.dump(todump, file, true);

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Dump.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
}
