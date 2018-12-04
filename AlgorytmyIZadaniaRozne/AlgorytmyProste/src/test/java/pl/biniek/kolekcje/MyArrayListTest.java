/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.biniek.kolekcje;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author piotr
 */
public class MyArrayListTest {
    MyArrayList emptyList = new MyArrayList<>();
    MyArrayList<CarForListTest> carList = new MyArrayList<>();
    MyArrayList<Integer> list10 = new MyArrayList<>(11);
    MyArrayList<Integer> intList = new MyArrayList<>();
   // MyArrayList<Integer> intList10 = new MyArrayList<>();
    
    
    public MyArrayListTest() {
    }

        @BeforeClass
    public static void setUpClass() {
    }
    
        @Before
    public void setUp() {
            for (int i = 0; i < 20; i++) {
                intList.add(i);
            }
            for (int i = 0; i < 10; i++) {
                list10.add(i);
                
               
            }
            for (int i = 0; i < 20; i++) {
                CarForListTest car = new CarForListTest(i);
                carList.add(car);
            }
            
        
    }
    
    
    /**
     * basic test of simple functions
     */
    
    
    
    
    public void testOfSimpleFunctionsOfMyArray() {
        System.out.println("simpleTest");
        MyArrayList<Long> myList = new MyArrayList<>();
        assertTrue(myList.isEmpty());
        
       long longus = 1;
       myList.add(longus);
        
         assertTrue(!myList.isEmpty());
         
         long longus2 = 1;
         assertTrue(myList.contains(longus));       
         assertTrue(myList.contains(longus2)); 
        int index= myList.indexOf(longus);
         
         assertEquals(1l, (long) myList.remove(index));
         System.out.println(myList.isEmpty());
         System.out.println(myList.size());
         assertTrue(!myList.contains(longus2)); 
         assertTrue(myList.isEmpty());
        
        }

    /**
     * Test of isEmpty method, of class MyArrayList.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
          assertTrue(emptyList.isEmpty()); 
          assertFalse(carList.isEmpty()); 
          assertFalse(intList.isEmpty()); 
          
          
          
          
    }

    /**
     * Test of contains method, of class MyArrayList.
     */
    @Test
    public void testContains() {
        assertTrue(carList.contains(new CarForListTest(1)));
        assertFalse(emptyList.contains(new CarForListTest(1)));
        assertTrue(intList.contains(1));
        assertFalse(intList.contains(25));
        intList.add(25);
        assertTrue(intList.contains(25));
        
        
    }

    /**
     * Test of iterator method, of class MyArrayList.
     */
   @Test
    public void testIterator() {
        System.out.println("iterator");
       Iterator<CarForListTest> iterCar = carList.iterator();
       Iterator<Integer> iterInt = intList.iterator();
       
       while(iterCar.hasNext()){
           System.out.println(" iterator car test "+iterCar.next());
           
       }
       while(iterCar.hasNext()){
           System.out.println(" iterator int test "+iterInt.next());
           
       }
       
       
    }

    /**
     * Test of toArray method, of class MyArrayList.
     */
    @Test
    public void testToArray() {
        Object testArray[]=new Object[10];
        for (int i = 0; i < 10; i++) {
                testArray[i]=i;
            }
        Object[] liczby = list10.toArray();
               
            assertArrayEquals(testArray, liczby);
            
           
        
    }
    /**
     * Test of second toArray method, of class MyArrayList.
     */
    @Test
    public void testToArray2() {
        Integer []testArray2=new Integer[10];
        for (int i = 0; i < 10; i++) {
                testArray2[i]=i;
            }
        System.out.println(list10.size());
        Integer[] inty = list10.toArray(testArray2);
               
            assertArrayEquals(testArray2, inty);
      ///////////////////////////////////////////////////////////////      
       CarForListTest []cflt = new CarForListTest[20];
              for (int i = 0; i < 20; i++) {
                CarForListTest car = new CarForListTest(i);
                cflt[i]=new CarForListTest(i);
            }
              
           CarForListTest []cflt2=carList.toArray(cflt);
           assertArrayEquals(cflt, cflt2);
              
              
            
        
    }

    /**
     * Test of toArray method, of class MyArrayList.
     */
   // @Test
    public void testToArray_GenericType() {
        System.out.println("toArray");
        Object[] a = null;
        MyArrayList instance = new MyArrayList();
        Object[] expResult = null;
        Object[] result = instance.toArray(a);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class MyArrayList.
     */
   // @Test
    public void testAdd_GenericType() {
        System.out.println("add");
        Object e = null;
        MyArrayList instance = new MyArrayList();
        boolean expResult = false;
        boolean result = instance.add(e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class MyArrayList.
     */
  //  @Test
    public void testRemove_Object() {
        System.out.println("remove");
        Object o = null;
        MyArrayList instance = new MyArrayList();
        boolean expResult = false;
        boolean result = instance.remove(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of containsAll method, of class MyArrayList.
     */
   // @Test
    public void testContainsAll() {
        System.out.println("containsAll");
        Collection c = null;
        MyArrayList instance = new MyArrayList();
        boolean expResult = false;
        boolean result = instance.containsAll(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAll method, of class MyArrayList.
     */
   // @Test
    public void testAddAll_Collection() {
        System.out.println("addAll");
        Collection c = null;
        MyArrayList instance = new MyArrayList();
        boolean expResult = false;
        boolean result = instance.addAll(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAll method, of class MyArrayList.
     */
   // @Test
    public void testAddAll_int_Collection() {
        System.out.println("addAll");
        int index = 0;
        Collection c = null;
        MyArrayList instance = new MyArrayList();
        boolean expResult = false;
        boolean result = instance.addAll(index, c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAll method, of class MyArrayList.
     */
   // @Test
    public void testRemoveAll() {
        System.out.println("removeAll");
        Collection c = null;
        MyArrayList instance = new MyArrayList();
        boolean expResult = false;
        boolean result = instance.removeAll(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retainAll method, of class MyArrayList.
     */
  //  @Test
    public void testRetainAll() {
        System.out.println("retainAll");
        Collection c = null;
        MyArrayList instance = new MyArrayList();
        boolean expResult = false;
        boolean result = instance.retainAll(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class MyArrayList.
     */
  //  @Test
    public void testClear() {
        System.out.println("clear");
        MyArrayList instance = new MyArrayList();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class MyArrayList.
     */
 //   @Test
    public void testGet() {
        System.out.println("get");
        int index = 0;
        MyArrayList instance = new MyArrayList();
        Object expResult = null;
        Object result = instance.get(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set method, of class MyArrayList.
     */
    //@Test
    public void testSet() {
        System.out.println("set");
        int index = 0;
        Object element = null;
        MyArrayList instance = new MyArrayList();
        Object expResult = null;
        Object result = instance.set(index, element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class MyArrayList.
     */
  //  @Test
    public void testAdd_int_Object() {
        System.out.println("add");
        int index = 0;
        Object element = null;
        MyArrayList instance = new MyArrayList();
        instance.add(index, element);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class MyArrayList.
     */
  //  @Test
    public void testRemove_int() {
        System.out.println("remove");
        int index = 0;
        MyArrayList instance = new MyArrayList();
        Object expResult = null;
        Object result = instance.remove(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of indexOf method, of class MyArrayList.
     */
   // @Test
    public void testIndexOf() {
        System.out.println("indexOf");
        Object o = null;
        MyArrayList instance = new MyArrayList();
        int expResult = 0;
        int result = instance.indexOf(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lastIndexOf method, of class MyArrayList.
     */
  //  @Test
    public void testLastIndexOf() {
        System.out.println("lastIndexOf");
        Object o = null;
        MyArrayList instance = new MyArrayList();
        int expResult = 0;
        int result = instance.lastIndexOf(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listIterator method, of class MyArrayList.
     */
  //  @Test
    public void testListIterator_0args() {
        System.out.println("listIterator");
        MyArrayList instance = new MyArrayList();
        ListIterator expResult = null;
        ListIterator result = instance.listIterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listIterator method, of class MyArrayList.
     */
   // @Test
    public void testListIterator_int() {
        System.out.println("listIterator");
        int index = 0;
        MyArrayList instance = new MyArrayList();
        ListIterator expResult = null;
        ListIterator result = instance.listIterator(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subList method, of class MyArrayList.
     */
   // @Test
    public void testSubList() {
        System.out.println("subList");
        int fromIndex = 0;
        int toIndex = 0;
        MyArrayList instance = new MyArrayList();
        List expResult = null;
        List result = instance.subList(fromIndex, toIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
