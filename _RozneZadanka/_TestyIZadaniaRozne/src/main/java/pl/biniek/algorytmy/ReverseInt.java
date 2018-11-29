/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.biniek.algorytmy;

/**
 *
 * @author piotr
 */
public class ReverseInt {
    public int reverseInt(int number){
     int  reversedInt = 0;
     while (number!=0){
         reversedInt=reversedInt*10;
         reversedInt+=number%10;
         number=number/10;
         
         
         }
     return reversedInt;
      
        
    }
        
        
    public static void main(String a[]){
        ReverseInt nr = new ReverseInt();
        System.out.println("Result: "+nr.reverseInt(54321));
    }
}