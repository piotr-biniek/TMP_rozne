/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.collectiontest;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 *
 * @author piotr
 */
public class LisToSetTest {
    
    
    public Set setByKonstructor(List list){
        Set set = new HashSet(list) ;
        return  set;
              
    }
    
    public Set setByForeEach(List list){
        Set set = new HashSet();
        for (Object object : list) {
            set.add(object);
            return set;
            
        } return set;
            
    }
    
        
        public Set setByStream(List list){
        // List personsSorted = list.stream().collect(Collectors.toList());   
           Set set =(HashSet) list.stream().collect(Collectors.toSet());
          return set;
        }
        
        
    }
            
            
            
            
            
            
            
            
            
    
    
