package net.gratel.school_manager.plugins;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;
import net.gratel.school_manager.App;
import net.gratel.school_manager.api.PluginAPI;

/**
 *
 * @author 陈濯
 */
public class SystemOutPlugin implements PluginAPI {

    @Override
    public void LoadPlugin() {
        JMenuItem a=new JMenuItem("SystemOut");
        a.addActionListener((ActionEvent e) -> {
            System.out.println("Hello");
            
        });
        App.jMenu6.add(a);
        System.out.println();
    }
    
}
