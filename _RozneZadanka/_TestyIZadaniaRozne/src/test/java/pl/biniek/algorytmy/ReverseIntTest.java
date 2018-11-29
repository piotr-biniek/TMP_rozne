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
public class ReverseIntTest {

 
    public ReverseIntTest() {
    }

  
    @Before
    public void setUp() {
    
    }

   @Test
   public void testReverseInt(){
       
       ReverseInt ri = new ReverseInt();
       int number = 87766541;
       
       assertEquals(14566778, ri.reverseInt(number));
       
   }
   
}
