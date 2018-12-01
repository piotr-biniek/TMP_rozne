/*
 *problem ucztujacych filozofów - wersja std. z blokowaniem sie wątków
 */
package pl.biniek.threads.filozofowie;

/**
 *
 * @author piotr
 */
public class UcztujacyFilozofowie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Stolik stolPiecioosobowy = new Stolik(5);
   stolPiecioosobowy.podanoPasze();
    
        
        
    }
            
    
}
