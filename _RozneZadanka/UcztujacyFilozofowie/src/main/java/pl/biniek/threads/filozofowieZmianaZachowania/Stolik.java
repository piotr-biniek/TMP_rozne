/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.biniek.threads.filozofowieZmianaZachowania;

import java.util.concurrent.Semaphore;

/**
 *
 * @author piotr
 */
public class Stolik {
    private final Filozof []filozofowie;
    private final Widelec [] widelce;
    private final int liczbMiejsc;
  
        public Stolik(int liczbaMiejsc) {
            
            liczbMiejsc=liczbaMiejsc;
           
            
            filozofowie=new Filozof[liczbaMiejsc];
            widelce = new Widelec[liczbaMiejsc];
           
            
            for (int i=0;i<liczbaMiejsc; i++) {
                widelce[i]=new  Widelec();
            }
            
            for (int i = 0; i < liczbaMiejsc; i++) {
                filozofowie[i]=new Filozof();
                filozofowie[i].setLewyWidelec(widelce[i]);
                filozofowie[i].setPrawyWidelec(widelce[(i+1)%(liczbaMiejsc)]);
                
            }
            
        }
        
        
            public void podanoPasze(){
                for (int i = 0; i < liczbMiejsc; i++) {
                    filozofowie[i].start();
                    
                }
                
            }
    
        }
        

