/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.biniek.threads.filozofowieSemafor;

import java.util.concurrent.Semaphore;

/**
 *
 * @author piotr
 */
public class Stolik {
    private final Filozof []filozofowie;
    private final Widelec [] widelce;
    private final int liczbMiejsc;
    private Semaphore semafor;
    
    
        public Stolik(int liczbaMiejsc) {
            
            liczbMiejsc=liczbaMiejsc;
           
            
            filozofowie=new Filozof[liczbaMiejsc];
            widelce = new Widelec[liczbaMiejsc];
            semafor=new Semaphore(liczbMiejsc-1);
            
            for (int i=0;i<liczbaMiejsc; i++) {
                widelce[i]=new  Widelec();
            }
            
            for (int i = 0; i < liczbaMiejsc; i++) {
                filozofowie[i]=new Filozof(this);
                filozofowie[i].setLewyWidelec(widelce[i]);
                filozofowie[i].setPrawyWidelec(widelce[(i+1)%(liczbaMiejsc)]);
                
            }
            
        }
        
        
            public void podanoPasze(){
                for (int i = 0; i < liczbMiejsc; i++) {
                    filozofowie[i].start();
                    
                }
                
            }
            
       public void zaczynamJesc() throws InterruptedException{
           semafor.acquire();
           
       }     
            
       public void zjadlem() throws InterruptedException{
           System.out.println("zwolniono swmafor");
           semafor.release();
           
       }       
        }
        

