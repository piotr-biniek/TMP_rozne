/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codility;

import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author piotr
 */
class SolutionMissingInteger2 {// wersja 2 - 100% 

    // write your code in Java SE 8
    public int solution(int[] array) {

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);

        }

        int testInt = 1;

        while (set.contains(testInt)) {
            testInt++;

        }

        return testInt;

    }
}
