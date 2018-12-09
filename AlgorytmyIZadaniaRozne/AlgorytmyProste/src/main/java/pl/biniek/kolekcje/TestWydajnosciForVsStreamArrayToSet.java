/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.biniek.kolekcje;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author piotr
 */
public class TestWydajnosciForVsStreamArrayToSet {

  

        // write your code in Java SE 8
        public Set<Integer> arrayToSetByFor(int[] array) {
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < array.length; i++) {
                set.add(array[i]);
            }
            return set;
        }

        public Set<Integer> arrayToSetByStream(int[] array) {
            HashSet<Integer> set = IntStream.of(array).boxed().collect(Collectors.toCollection(HashSet::new));
            return set;
        }
    }


