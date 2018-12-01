/*
 * testowanie szybkosci zamiany listy na set forem, konstruktorem i lambda wywolanie testem
 */
package pl.biniek.kolekcje;

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
            
            
            
            
            
            
            
            
            
    
    
