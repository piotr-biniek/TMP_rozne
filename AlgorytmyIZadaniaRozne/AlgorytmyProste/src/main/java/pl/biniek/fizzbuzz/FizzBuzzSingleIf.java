/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.biniek.fizzbuzz;

/**
 *
 * @author piotr
 */
public class FizzBuzzSingleIf {

        public static void main(String[] args)  {
            
            for (int i = 1; i<101;i++){
                if ((i%3==0&&getFizz())|(i%5==0&&getBuzz()));
                else System.out.print(i);
                System.out.print("\n");
            }
        }
        
        public static boolean getFizz(){
            System.out.print("Fizz");
            return true;

        }
          public static boolean getBuzz(){
            System.out.print("Buzz");
            return true;

        }
          
    
    
}   

