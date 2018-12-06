/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codility;

import java.util.Arrays;

/**
 *
 * @author piotr
 */
public class SolutionPermMissingElem{

   public int solution(int[] array){
       
     //  if (array == null) return 1;
       if (array.length<1) return 1;
       
       Arrays.sort(array);
       if (array[0]!=1)return 1;
       
       for (int i = 1; i < array.length; i++) {
           if ((array[i]-array[i-1])!=1) return (array[i]+array[i-1])/2;
           
       }
       return array[array.length-1]+1;
       
   }

    

    
}
