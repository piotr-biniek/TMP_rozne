/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codility;

import java.util.HashSet;
import java.util.Set;




class SolutionDistinct {

    public int solution(int[] array) {
        Set set = new HashSet();
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }
        return set.size();
    }



    public static void main(String[] args) {
        SolutionDistinct ste = new SolutionDistinct();
        int[] test = {3, 1, 2, 4, 3};
        System.out.println(ste.solution(test));

    }

}
