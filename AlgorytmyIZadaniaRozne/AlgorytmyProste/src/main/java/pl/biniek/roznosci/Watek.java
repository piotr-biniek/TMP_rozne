/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.biniek.roznosci;

/**
 *
 * @author piotr
 */
public class Watek extends Thread {

    @Override
    public void run() {
        super.run(); int i=0;
        
        while (i<10_000) { 
            System.out.println("i: "+i);
            i++;
            
        }
//To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
