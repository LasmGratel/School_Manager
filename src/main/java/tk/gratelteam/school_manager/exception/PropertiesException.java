/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tk.gratelteam.school_manager.exception;

/**
 *
 * @author 陈濯
 */
public class PropertiesException extends Throwable{
    public PropertiesException(){};
    public PropertiesException(String text){
        super(text);
    }
}
