/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.biniek.algorytmy;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author piotr
 */
public class isBinaryNumberTest {
    
    public isBinaryNumberTest() {
    }

    @Test
    public void testIsBinaryNumber() {
        
        int a = 1101011010;
        int b = 10120010;
        IsBinaryNumber ibn = new IsBinaryNumber();
        
        assertTrue(ibn.isBinaryNumber(a));
        assertFalse(ibn.isBinaryNumber(b));
       
    }
    
}
