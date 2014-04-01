/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.gratel.school_manager.yaml;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author 陈濯
 */
public class Clear {
    public static void clear() throws IOException{
        File file=new File("Data.yml");
        file.delete();
        file.createNewFile();
    }
}
