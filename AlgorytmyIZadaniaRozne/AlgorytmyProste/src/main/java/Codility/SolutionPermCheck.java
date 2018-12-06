/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codility;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 *
 * @author piotr only 33% wery week in efficency
 */
public class SolutionPermCheck {

    public int solution(int[] array) {

        
        Arrays.sort(array);
        for (int i = 1; i < array.length+1; i++) {
            if (array[i-1]!=i)return 0;
            
        }
        
        return 1;
        
        
    }

    public static void main(String[] args) {
        SolutionPermCheck ste = new SolutionPermCheck();
        int[] test = {3, 1, 2, 4, 3};
        System.out.println(ste.solution(test));

    }

}
