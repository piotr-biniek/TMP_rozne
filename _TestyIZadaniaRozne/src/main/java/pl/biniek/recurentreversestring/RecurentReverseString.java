/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.biniek.recurentreversestring;

/**
 *
 * @author piotr
 */
public class RecurentReverseString {
    
    String odwrotny = "";
    
    public String odwrocStringOryginal(String string){
        if(string.length()==1) {
            odwrotny+=string;
            return string   ;
        }
        else 
        {
            odwrotny+=string.charAt(string.length()-1);
            odwrocStringOryginal(string.substring(0, string.length()-1));
            
        }
       return odwrotny; 
    }
    
    
    
    
    public String myOdwrocString(String string){ 
        String odwracanie2="";
        if(string.length()==1) {odwracanie2+=string;
           
        }
        else {
          odwracanie2+=string.charAt(string.length()-1);
          odwracanie2+= myOdwrocString((string.substring(0, string.length()-1)));
           
           
        }
        return odwracanie2;
           
    }
    
    
  
    public static void main(String[] args) {
        // TODO code application logic here
        
       // String s ="dupablada";
         String k ="abcd";
        RecurentReverseString rrs = new RecurentReverseString();
      //  System.out.println(rrs.odwrocString(s));
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
