/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.gratel.school_manager;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 陈濯
 */
public class Properties {
    public static String getProperties(String key) throws IOException{
        java.util.Properties properties=new java.util.Properties();
        try {
            properties.load(new BufferedReader(new FileReader(new File("settings.properties"))));
            return properties.getProperty(key);
        } catch (FileNotFoundException ex) {
            new File("settings.properties").createNewFile();
            properties.load(new BufferedReader(new FileReader(new File("settings.properties"))));
            Logger.getLogger(Properties.class.getName()).log(Level.SEVERE, null, ex);
            return properties.getProperty(key);
        }
    }
    /**
     *
     * @param key
     * @return
     * 
     */ 
    public static String getLanguage(String key){
        java.util.Properties properties=new java.util.Properties();
        try {
            properties.load(new BufferedReader(new FileReader(new File(getProperties("language")+".properties"))));
            return properties.getProperty(key);
        } catch (IOException  ex) {
            try {
                new File(getProperties("language")+".properties").createNewFile();
                properties.load(new BufferedReader(new FileReader(new File(getProperties("language")+".properties"))));
                Logger.getLogger(Properties.class.getName()).log(Level.SEVERE, null, ex);
                return properties.getProperty(key);
            } catch (IOException ex1) {
                
                Logger.getLogger(Properties.class.getName()).log(Level.SEVERE, null, ex1);
                return ex1.getMessage();
            }
        }
    }
}
