/*
 * algorytm odwracający inta dzielimy modulo 10
 */
package pl.biniek.algorytmyizadaniarozne;

import java.util.Arrays;

/**
 *
 * @author piotr
 */
public class OneIntMissing {
    public int solution(int[] array){
       // array from 1 to .... one int missing
       
        Arrays.sort(array);
        if(array[0]!=1)return 1;
        for (int i = 1; i < array.length; i++) {
            if(array[i]!=i)return i;
            
            
            
        }
 
         return 0;
  
    
        
    }
        
        
    public static void main(String a[]){
        OneIntMissing nr = new OneIntMissing();
      ///  System.out.println("Result: "+nr.reverseInt(54321));
    }
}