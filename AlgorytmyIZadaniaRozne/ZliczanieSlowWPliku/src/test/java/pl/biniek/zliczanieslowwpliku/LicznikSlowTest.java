/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.biniek.zliczanieslowwpliku;

import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author piotr
 */
public class LicznikSlowTest {
    
    public LicznikSlowTest() {
    }

    /**
     * Test of zliczSlowa method, of class LicznikSlow.
     */
    @Test
    public void testZliczSlowa() {
       
        String string = "adam mada dada";
        LicznikSlow instance = new LicznikSlow();
         Map<String,Integer> expResult = new LinkedHashMap<>();
         expResult.put("adam", 1);
         expResult.put("mada", 1);
         expResult.put("dada", 1);
        instance.zliczSlowa(string);
        System.out.println(instance.liczbaSlow());
        System.out.println(expResult);
        assertEquals(expResult,instance.liczbaSlow());
    }

    /**
     * Test of liczbaSlow method, of class LicznikSlow.
     */
    @Test
    public void testLiczbaSlow() {
       
        LicznikSlow instance = new LicznikSlow();
        Map<String,Integer> expResult = new LinkedHashMap<>();
        Map result = instance.liczbaSlow();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of posortowanaLiczbaSlow method, of class LicznikSlow.
     */
    @Test
    public void testPosortowanaLiczbaSlow() {
       
        LicznikSlow instance = new LicznikSlow();
       Map<String,Integer> expResult = new LinkedHashMap<>();
        Map<String, Integer> result = instance.posortowanaLiczbaSlow();
        assertEquals(expResult, result);
       
    }
    
    @Test(expected = NullPointerException.class)
    public void testNullString() {
        LicznikSlow instance = new LicznikSlow();
        instance.zliczSlowa(null);
        
    }
}
