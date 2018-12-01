/*
 * Algorytm sortujący dowolną mapę po wartościach, wykożystuje obiekt Entry(dwuwartościowy - taka para)  
 * który jest listą pozyskiwany z mapy zawierający obie wartości nastepnie sortowanie po value (Comparable)
 * 2 metody statyczna i klasowa
 * wartości muszą być comparable
 * 
 */
package pl.biniek.kolekcje;

//import java.util.HashMap;
import java.util.*;
import java.util.Map;

/**
 *
 * @author piotr
 */
public  class HashMapSort<K,V extends Comparable> {
    
 
    public  Map <K, V>  sortByValue(Map<K, V> map) {
        List<Map.Entry<K, V>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        Map<K, V> result = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }

        return result;
    }
    
     public static <K,V extends Comparable> Map <K, V>  sortByValueStatic(Map<K, V> map) {
        List<Map.Entry<K, V>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        Map<K, V> result = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }

        return result;
    }
    
}
 
        
