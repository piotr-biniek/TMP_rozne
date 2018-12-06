/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author piotr
 */
public class SolutionFrogJmp{

    public int solution2(int start, int end, int step) {

        if (end <= start) {
            return 0;
        }
        int i = 0;
        while (start < end) {
            start = start + step;
           
            i++;

        }

        return i;
    }

 public int solution(int start, int end, int step) {

       double diff=end-start;
       double division = diff/step;
       System.out.println(division);
       int expectedValue = (int) Math.ceil(division);
         System.out.println( Math.ceil(division));
         
       
       
        return expectedValue;
    }

    

    public static void main(String[] args) {
       // Solution sol = new Solution();
      //  System.out.println( sol.solution(10, 85, 30));

    }
}
