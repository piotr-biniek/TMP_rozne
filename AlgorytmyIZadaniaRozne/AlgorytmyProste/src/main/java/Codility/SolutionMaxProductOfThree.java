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
class SolutionMaxProductOfThree {// 

    // write your code in Java SE 8
    public int solution(int[] array) {

       if(array.length==3) return (array[0]*array[1]*array[2]);

       Arrays.sort(array);
       if(array[array.length-1]*array[array.length-2]*array[array.length-3]>array[0]*array[1]*array[array.length-1]){
           return array[array.length-1]*array[array.length-2]*array[array.length-3];
       }
       
       return array[0]*array[1]*array[array.length-1];

    }
}
