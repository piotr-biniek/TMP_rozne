/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.biniek.collectiontest;

import pl.biniek.kolekcje.FindRepeatediLetters;
import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author piotr
 */
public class FindRepeatedLettersTest {

    public FindRepeatedLettersTest() {
    }

    @Test
    public void findRepeatedLettersTest() {

        Map<Character, Integer> testMap = new LinkedHashMap<>();

        Assert.assertTrue(testMap.equals(FindRepeatediLetters.findRepeatedLetters("abcdefg")));

        testMap.put('a', 2);
      
        Assert.assertTrue(testMap.equals(FindRepeatediLetters.findRepeatedLetters("abcdefga")));
 
        testMap.put('b', 2);        
        FindRepeatediLetters.findRepeatedLetters("abcdefgab");

        testMap.put('a', 4);
        testMap.put('b', 3);        
        testMap.put('c', 2); 
        Assert.assertTrue(testMap.equals(FindRepeatediLetters.findRepeatedLetters("abcdefgaaabbc")));
        System.out.println(FindRepeatediLetters.findRepeatedLetters("abcdefgaaabgacabbc"));

    }

    @Test(expected = NullPointerException.class)
    public void testNullString() {
        FindRepeatediLetters.findRepeatedLetters(null);
    }
}
