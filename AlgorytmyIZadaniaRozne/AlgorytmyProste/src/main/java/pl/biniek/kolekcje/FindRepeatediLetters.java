/*
 * sprawdza czy w stringu sa powturzone litery i je zwraca (mapę) -> test
 */
package pl.biniek.kolekcje;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author piotr
 */
public class FindRepeatediLetters {

    public static Map<Character, Integer> findRepeatedLetters(String s) {
      if (s==null) throw new NullPointerException();
     Map<Character, Integer> mapOfRepeated = new LinkedHashMap<>();
      Map<Character, Integer> mapOfChars= mapAllChars(s);
      for(char c:mapOfChars.keySet()){
          if (mapOfChars.get(c)>1) mapOfRepeated.put(c, mapOfChars.get(c));
        }

return mapOfRepeated;
    }
    
    private static  Map<Character,Integer> mapAllChars(String s){
        
         Map <Character, Integer>mapaZnakow = new LinkedHashMap<>();
        char[] znaki = s.toCharArray();
        for (char c : znaki) {
            if (!mapaZnakow.containsKey(c)) {
                mapaZnakow.put(c, 1);
            } else {
                mapaZnakow.put(c, ((int) mapaZnakow.get(c)) + 1);
            }

            
        }
        
        return mapaZnakow;
    }

}
