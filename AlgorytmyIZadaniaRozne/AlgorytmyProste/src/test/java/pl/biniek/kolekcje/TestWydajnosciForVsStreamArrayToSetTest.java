/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.biniek.kolekcje;

import java.util.Set;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author piotr
 */
public class TestWydajnosciForVsStreamArrayToSetTest {

    public TestWydajnosciForVsStreamArrayToSetTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }
    final int testsize = 10_000_000;
    int[] arrayForFor = new int[testsize];
    int[] arrayForStream = new int[testsize];
    int tmp = 0;

    @Before
    public void setUp() {// warmup to get inline without warmup fore 2-3x faster, with warmup for 10%-15% faster
        //setup of arrays
        for (int i = 0; i < testsize; i++) {
            tmp = (int) Math.random() * testsize;
            arrayForFor[i] = tmp;
            arrayForStream[i] = tmp;

        }

        // warmup
        TestWydajnosciForVsStreamArrayToSet tst = new TestWydajnosciForVsStreamArrayToSet();
        for (int i = 0; i < 50; i++) {
            Set<Integer> set = tst.arrayToSetByFor(arrayForFor);

        }

        for (int i = 0; i < 50; i++) {
            Set<Integer> set = tst.arrayToSetByStream(arrayForStream);

        }

    }

    @Test
    public void testMethodFor() {
       long start =  System.nanoTime();
       TestWydajnosciForVsStreamArrayToSet test = new TestWydajnosciForVsStreamArrayToSet();
        Set<Integer> set = test.arrayToSetByFor(arrayForFor);
         long stop =  System.nanoTime();
         
         System.out.println("czas koiowania by for w us: "+(stop-start)/1000);
         
        
    }

    
    @Test
    public void testMethodStream() {
             long start =  System.nanoTime();
       TestWydajnosciForVsStreamArrayToSet test = new TestWydajnosciForVsStreamArrayToSet();
        Set<Integer> set = test.arrayToSetByStream(arrayForStream);
         long stop =  System.nanoTime();
         
         System.out.println("czas koiowania by stream w us: "+(stop-start)/1000);
         
    }

    
    
}
