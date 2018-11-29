/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.biniek.collectiontest;

import pl.biniek.collectiontest.MyMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author piotr
 */
public class ListToSetTest {

    List<String> list;

    public ListToSetTest() {
        list = new ArrayList<>(300_000);
    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        for (int i = 0; i < 100_000; i++) {
            list.add("String: " + 1);

        }
        System.out.println("Build up finished");
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of setByKonstructor method, of class NewClass.
     */
    //  @Test
    public void testSetByKonstructor() {
        System.out.println("setByKonstructor");
        LisToSetTest instance = new LisToSetTest();
//        System.out.println("Warm Up.......................");
//        
//        for (int i = 0; i < 1_000; i++) {
//        Set set = instance.setByKonstructor(list); 
//            
//        }

        System.out.println("Start");
        long start = System.nanoTime();

        //  for (int i = 0; i < 1000; i++) {
        // }
        Set set = instance.setByKonstructor(list);

        long stop = System.nanoTime();

        System.out.println("Czas setByKonstructor " + (stop - start));

    }

    /**
     * Test of setByForeEach method, of class NewClass.
     */
    //   @Test
    public void testSetByForeEach() {
        System.out.println("setByForeEach");
        LisToSetTest instance = new LisToSetTest();
//        System.out.println("Warm Up.......................");
//        
//        for (int i = 0; i < 1_000; i++) {
//         Set set=  instance.setByForeEach(list); 
//            
//        }

        System.out.println("Start");
        long start = System.nanoTime();

        //  for (int i = 0; i < 1000; i++) {
        // }
        Set set = instance.setByForeEach(list);

        long stop = System.nanoTime();

        System.out.println("Czas setByForeEach  " + (stop - start));

    }

    /**
     * Test of setByStream method, of class NewClass.
     */
    // @Test
    public void testSetByStream() {
        System.out.println("setByStream");

        LisToSetTest instance = new LisToSetTest();
//        System.out.println("Warm Up.......................");
//        
//        for (int i = 0; i < 1_000; i++) {
//           instance.setByStream(list); 
//            
//        }

        System.out.println("Start");
        long start = System.nanoTime();

        //  for (int i = 0; i < 1000; i++) {
        // }
        Set set = instance.setByStream(list);

        long stop = System.nanoTime();

        System.out.println("Czas setByStream  " + (stop - start));

    }

    //   @Test
    public void testMyMap() {

        MyMap<String, String> map = new MyMap<String, String>();
        map.put("dupa", "blada");
//        map.entrySet();
    }

    @Test
    public void testHashMapSort() {
        System.out.println("Non static Sort ");
        Map<String, String> map = new HashMap<>();
        map.put("1", "jeden");
        map.put("2", "dwa");
        map.put("3", "trzy");
        map.put("4", "cztery");
        System.out.println(map);
        HashMapSort<String, String> hm = new HashMapSort<>();

        Map sortedMap = hm.sortByValue(map);
        System.out.println(sortedMap);
    }

    @Test
    public void testHashMapSortStatic() {
        System.out.println("Static Sort ");
        Map<String, String> map = new HashMap<>();
        map.put("1", "jeden");
        map.put("2", "dwa");
        map.put("3", "trzy");
        map.put("4", "cztery");
        System.out.println(map);
        // HashMapSort<String, String> hm= new HashMapSort<>();

        Map sortedMap = HashMapSort.sortByValueStatic(map);
        System.out.println(sortedMap);
    }
}
