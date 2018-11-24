/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.biniek.roznosci;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author piotr
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
    Employee[] pracownicy = new Employee[4];
    pracownicy[0]=new Employee("Sswqe");
    pracownicy[1]=new Employee("Aswqe");
pracownicy[2]=new Employee("Gswqe");    
        pracownicy[3]=new Employee("Tswqe");
        
        
        Arrays.sort(pracownicy, new Comparator<Employee>() {
        
        @Override
        public int compare(Employee o1, Employee o2) {
           return o1.name.compareTo(o2.name);
        }
    });
        
       
        
        Arrays.sort(pracownicy, new Comparator<Employee>() {
        
        @Override
        public int compare(Employee o1, Employee o2) {
           return o1.name.compareTo(o2.name);
        }
    });
                
        
       List lista = Arrays.asList(pracownicy);
       
        
//        lista.sort((Employee o1, Employee o2) -> { 
//            return o1.name.compareTo(o2.name); //To change body of generated lambdas, choose Tools | Templates.
//        });
       
//       lista.sort((Employee e1,Employee e2)
//               ->e1.name.compareTo(e2.name));
//       
        
       try( BufferedWriter bf = new BufferedWriter(new FileWriter("testowo"));){
        bf.write("dddddd");
       
       } 
       
try(ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream("obj.tst", true))){
    
    ois.writeObject(pracownicy[1]);
    
    
    
    
}
        
        
        
        
        
         Thread t1 = new Thread();
    
         
         LiczbyCztery liczba=LiczbyCztery.CZTERY ;
         
         
         switch(liczba){
                 
                 case JEDEN: System.out.println("1");break;
                 case DWA: System.out.println("2");break;
                 case TRZY: System.out.println("3");break;
                
                 default :System.out.println("czy 4?");
         
         
         }

    
         Watek w1 = new Watek();
         w1.start();
         
         
}
    
}
