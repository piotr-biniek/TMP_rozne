/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.biniek.stringi;

import java.io.Console;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;

/**
 *
 * @author piotr
 */
public class FormatowanieStringow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

        StringBuilder sb = new StringBuilder();
        sb.append("witaj, wpisz tekst");
        System.out.println(sb);
    //    Scanner input = new Scanner(System.in);
    //    String inputText = input.nextLine();
      //  System.out.println("Wpisano: "+inputText);
       // input.next(); // 1 słowo
      // Console con =  
     //  inputText = System.console().readLine();
      // System.console().printf(inputText, inputText);
      int i =1111;
      double j = 22222.22;
        System.out.printf("% .2f \n", 10000.00/3);
       System.out.printf("rozne formaty to np int :  % d i double szesnastkowo: %a \n",i,j);
         System.out.printf("rozne formaty to np int usemkowo :  %o i double exp %e \n",i,j);
       System.out.printf("rozne formaty to np  int szesnastkowo :  %x i double szkrót %h \n",i,j);
       System.out.printf("rozne formaty to np int :  % d i double szesnastkowo %h \n",i,j);
       System.out.printf("rozne formaty to np int :  % d i double szesnastkowo %h \n",i,j);
        System.out.println("");
        
        System.out.printf("rozne formaty z dolarem, int :  %1$d, int usemkowo  %1$o int szesnastkowo :  %1$x \n"
                + " double szesnastkowo: %2$a double exp %2$e double: %2$f double szkrót %2$h",i,j);
       
       
       
        
        
        
    }
    
}
