/*
 * ©2014 Gratel Team.
 * Anybody can modify that things 
 * BUT NOT CHANGE GENERAL THINGS.
 * and this project is under the LGPL3.
 * (http://www.gnu.org/licenses/lgpl.html)
 */

package tk.gratelteam.school_manager.plugins;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenuItem;
import tk.gratelteam.school_manager.App;
import tk.gratelteam.school_manager.api.PluginAPI;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author 陈濯
 */
public class LoadPlugin {
    public static void LoadPluginAtBase(){
        File base=new File(".");
        File[] files=base.listFiles();
        String[] regex={".+\\.yml",".+\\.smp"};
        for(File f:files){
            for(String regexs:regex){
           if(f.getName().matches(regexs)){
               try {
                   List<String> l=FileUtils.readLines(f,"UTF-8");
                   JMenuItem Plugin=new JMenuItem(l.get(0).substring(6));
                   Plugin.addActionListener((ActionEvent e) -> {
                       try {
                           ((PluginAPI)Class.forName(l.get(1).substring(7)).newInstance()).LoadPlugin();
                       } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                           Logger.getLogger(LoadPlugin.class.getName()).log(Level.SEVERE, null, ex);
                       }
                   });
                   App.jMenu5.add(Plugin);
                   
               } catch (IOException ex) {
                   Logger.getLogger(LoadPlugin.class.getName()).log(Level.SEVERE, null, ex);
               }
               
           }
            }
        }
    }
    public static void LoadPluginAtSelectFiles(File[] files){
        String[] regex={".+\\.yml",".+\\.smp"};
    
        for(File f:files){
            for(String regexs:regex){
           if(f.getName().matches(regexs)){
               try {
                   List<String> l=FileUtils.readLines(f,"UTF-8");
                   JMenuItem Plugin=new JMenuItem(l.get(0).substring(6));
                   Plugin.addActionListener((ActionEvent e) -> {
                       try {
                           ((PluginAPI)Class.forName(l.get(1).substring(7)).newInstance()).LoadPlugin();
                       } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                           Logger.getLogger(LoadPlugin.class.getName()).log(Level.SEVERE, null, ex);
                       }
                   });
                   App.jMenu5.add(Plugin);
                   
               } catch (IOException ex) {
                   Logger.getLogger(LoadPlugin.class.getName()).log(Level.SEVERE, null, ex);
               }
               
           }
            }
    }
}
}
