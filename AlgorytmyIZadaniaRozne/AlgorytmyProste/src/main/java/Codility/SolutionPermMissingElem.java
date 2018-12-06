/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codility;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author piotr
 */
public class SolutionPermMissingElem{

   public int solution(int[] array){//90% solution
       
     //  if (array == null) return 1;
       if (array.length<1) return 1;
       
       Arrays.sort(array);
       if (array[0]!=1)return 1;
       
       for (int i = 1; i < array.length; i++) {
           if ((array[i]-array[i-1])!=1) return (array[i]+array[i-1])/2;
           
       }
       return array[array.length-1]+1;
       
   }

   public int secondSolution(int[] array){// 80% solution 100% corrct byt sloooow todo
       
     //  if (array == null) return 1;
       if (array.length<1) return 1;
       
       Arrays.sort(array);
       if (array[0]!=1)return 1;
       
        long sumaOczekiwana =( (1 + array[array.length-1]) * array[array.length-1])/ 2L;
        System.out.println(sumaOczekiwana);
        long sumaCiagu = sumaRzeczywista(array);
        System.out.println(sumaCiagu);
        if (sumaOczekiwana==sumaCiagu) return array[array.length-1]+1;
        
        return (int) (sumaOczekiwana-sumaCiagu  );
       

    }

    private static long sumaRzeczywista(int[] array) {
        long suma = 0;
        for (int i = 0; i < array.length; i++) {
            
            suma += array[i];

        }
        return suma;
    }

    public static void main(String a[]){
      SolutionPermMissingElem sol = new SolutionPermMissingElem();
      int[] ar ={ 2, 3, 1, 5};
        System.out.println(sol.secondSolution(ar));
    }
}
