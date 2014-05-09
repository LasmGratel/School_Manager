/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tk.gratelteam.school_manager.api;

import java.util.Properties;

/**
 *
 * @author 陈濯
 */
public interface LanguageAPI {
    
    @Override
    public String toString();
    
    public void setProperties(Properties p);
    public Properties getProperties();
}
