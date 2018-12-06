/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codility;

import java.util.Arrays;




class SolutionTriangle {// todo sprawdzic wymagania

    public int solution(int[] array) {
        Arrays.sort(array);
        
        if(array.length<3) return 0;
        
        for (int i = 0; i < array.length-2; i++) {
            if(array[i]+array[i+1]>array[i+2]) return 1;
            
        }
        
       return 0;
    }



    public static void main(String[] args) {
        SolutionTriangle ste = new SolutionTriangle();
        int[] test = {3, 1, 2, 4, 3};
        System.out.println(ste.solution(test));

    }

}
