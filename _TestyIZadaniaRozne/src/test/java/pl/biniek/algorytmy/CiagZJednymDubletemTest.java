/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.biniek.algorytmy;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author piotr
 */
public class CiagZJednymDubletemTest {

    List<Integer> basicList = new ArrayList<>();
    int expResult = 100;

    public CiagZJednymDubletemTest() {
    }

  
    @Before
    public void setUp() {

        for (int i = 1; i < 10001; i++) {
            basicList.add(i);
            if (i == 1500) {
                basicList.add(expResult);
            }
        }
        
        //Warmup
        ArrayList<Integer > warmuplist = new ArrayList<>();
                for (int i = 1; i < 10001; i++) {
            warmuplist.add(i);
            if (i == 5000) {
                warmuplist.add(expResult);
            }
            
                    for (int j = 0; j < 10; j++) {
                     CiagZJednymDubletem.getDublet(warmuplist)  ;
                    // CiagZJednymDubletem.findDuplicateNumberInFore(warmuplist);
                     CiagZJednymDubletem.findDuplicateNumber(warmuplist);
                     
                        
                    }
            
            
        }
        
        
        
        
        
    }

   
    /**
     * Test of getDublet method, of class CiagZJednymDubletem.
     */
    @Test
    public void testGetDublet() {
        System.out.println("getDublet");
        
    ArrayList <Integer> lista = new ArrayList<>(basicList);
    
    long start = System.nanoTime();
    int result = CiagZJednymDubletem.getDublet(lista);
    
        long stop = System.nanoTime();
    System.out.println ("--------------- " + result+", Time: "+(stop-start));
    assertEquals(expResult, result);
 

}

   @Test
    public void testFindDuplicateNumber() {
        System.out.println("FindDuplicateNumber");
        
    ArrayList <Integer> lista = new ArrayList<>(basicList);
    

    long start = System.nanoTime();
    int result = CiagZJednymDubletem.findDuplicateNumber(lista);
   
      
        long stop = System.nanoTime();
    System.out.println ("--------------- " + result+", Time: "+(stop-start));
    assertEquals(expResult, result);
 

}   
  //  @Test
    public void testFindDuplicateNumberInFore() {
        System.out.println("FindDuplicateNumberinFore");
        
    ArrayList <Integer> lista = new ArrayList<>(basicList);
    

    long start = System.nanoTime();
    int result = CiagZJednymDubletem.findDuplicateNumberInFore(lista);
  
        long stop = System.nanoTime();
    System.out.println ("--------------- " + result+", Time: "+(stop-start));
    assertEquals(expResult, result);
 

}   
}
