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
import java.util.Collections;
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
        pracownicy[0] = new Employee("Sswqe");
        pracownicy[1] = new Employee("Aswqe");
        pracownicy[2] = new Employee("Gswqe");
        pracownicy[3] = new Employee("Tswqe");

        
        
        // rozne sortowania
         List lista = Arrays.asList(pracownicy);
        
        Arrays.sort(pracownicy, new Comparator<Employee>() {//anonimowy comparator

            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        
            Arrays.sort(pracownicy);//wykożystany interface Comparable w klasie
          
        Arrays.sort(pracownicy, (Employee p1, Employee p2) -> p1.name.compareTo(p2.name));///lambda
           
          // sortowanie kolekcji
       
        Collections.sort(lista);//wykożystany interface Comparable
        Collections.sort(lista, new Comparator<Employee>() {//anonimowy comparator

            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        lista.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                 return o1.name.compareTo(o2.name);
            }
        });
         
        Collections.sort(lista, (Employee p1, Employee p2) -> p1.name.compareTo(p2.name));///lambda
        
          
        // z jakichś przyczyn 2 poniższe sortowania nie działają
        
//        lista.sort((Employee o1, Employee o2) -> { // błąd jakis przy lambdach
//            return o1.name.compareTo(o2.name); //cos nie tak
//        });
//
//        lista.sort((Employee p1, Employee p2) ->  (p1.name).compareTo(p2.name));// lambda
//        
//        
      // lista.sort(c);
       
        try (BufferedWriter bf = new BufferedWriter(new FileWriter("testowo"));) {
            bf.write("dddddd");

        }// try with resoures zapis pliku

        try (ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream("obj.tst", true))) {// serializacja

            ois.writeObject(pracownicy[1]);
            ois.writeObject(lista);
            

        }
      
        LiczbyCztery liczba = LiczbyCztery.CZTERY;//switch na enumach
        switch (liczba) {

            case JEDEN:
                System.out.println("1");
                break;
            case DWA:
                System.out.println("2");
                break;
            case TRZY:
                System.out.println("3");
                break;

            default:
                System.out.println("czy 4?");

        }

        Watek w1 = new Watek();
        w1.start();

    }

}
