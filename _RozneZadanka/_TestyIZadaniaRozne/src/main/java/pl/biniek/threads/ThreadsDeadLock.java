/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.biniek.threads;

/**
 *
 * @author piotr
 */
public class ThreadsDeadLock {
  
   
    String string1 = "Ala ";
    String string2 = "Makota";
     
    Thread trd1 = new Thread("W1"){
        public void run(){
            while(true){
                synchronized(string1){//synchronizacja na obiekcie nie na metodzie
                    synchronized(string2){
                        System.out.println(string1 + string2);
                    }
                }
            }
        }
    };
     
    Thread trd2 = new Thread("My Thread 2"){
        public void run(){
            while(true){
                synchronized(string2){
                    synchronized(string1){
                        System.out.println(string2 + string1);
                    }
                }
            }
        }
    };
     
    public static void main(String a[]){
        ThreadsDeadLock tdl = new ThreadsDeadLock();
        tdl.trd1.start();
        tdl.trd2.start();
    }
}
    

