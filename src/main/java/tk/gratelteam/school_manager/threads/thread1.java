/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tk.gratelteam.school_manager.threads;

import java.net.Socket;

/**
 *
 * @author 陈濯
 */
public class thread1 extends Thread{
    public Socket socket;
    public thread1(){}
    public thread1(Socket socket){
        this.socket=socket;
    }
    @Override
    public void run() {
        
    }
    
}
