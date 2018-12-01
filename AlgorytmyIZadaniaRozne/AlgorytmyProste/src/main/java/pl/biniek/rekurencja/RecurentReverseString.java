/*
 * Odwracanie stringu za pomocą rekurencji
 * wersja moja i wersja  przerobiona z wersji internetowej bazującej na gobalnej zmiennej i na break (u mnie bez break)
 *  moja 2 wersja zwija się po osoiągnieciu konca stringu
 */

package pl.biniek.rekurencja;

/**
 *
 * @author piotr
 */
public class RecurentReverseString {
    
    String odwrotny = "";
    
    public String odwrocStringGlobalnaZmienna(String string){
        if(string.length()==1) {
            odwrotny+=string;
            return string   ;
        }
        else 
        {
            odwrotny+=string.charAt(string.length()-1);
            odwrocStringGlobalnaZmienna(string.substring(0, string.length()-1));
            
        }
       return odwrotny; 
    }
    
    
    
    
    public String myOdwrocString(String string){ 
        if (string==null) throw new NullPointerException("Pusty String");
        String odwroconyString="";
        if(string.length()==1) {odwroconyString+=string;
           
        }
        else {
          odwroconyString+=string.charAt(string.length()-1);
          odwroconyString+= myOdwrocString((string.substring(0, string.length()-1)));
           
           
        }
        return odwroconyString;
           
    }
    
    
  
    public static void main(String[] args) {
        // TODO code application logic here
        
       // String s ="dupablada";
         String k ="abcd";
         String m ="efghij";
        RecurentReverseString rrs = new RecurentReverseString();
       System.out.println(rrs.odwrocStringGlobalnaZmienna(m));
        System.out.println(rrs.myOdwrocString(k));
      
        
    }
    
    
    
    
    
    
    
    
    
    
    
//    
//    
//     public String odwrocString3(String string){ 
//        String odwrotny2="";
//        if(string.length()>1) {
//            System.out.println("rekkur");
//             odwrotny2+= odwrocString2(string.substring(0, string.length()-1));
//        }      
//        else{  
//            System.out.println("nonrekkur"+string.charAt(string.length()-1));
//            odwrotny2+=string.charAt(string.length()-1);
//        }
//        System.out.println("exiting" + odwrotny2);
//      return odwrotny2;   
//    }
    
}
