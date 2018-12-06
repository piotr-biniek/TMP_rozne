/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author piotr
 */
public class SolutionOddOccurrencesInArray {

   
        
    public int solution(int[] givenArray) {
        if(givenArray.length<2) return givenArray[0];
        
        Arrays.sort(givenArray);
        
        
        
        for (int i = 0; i < givenArray.length;i++) {
            if(i%2==1&&givenArray[i]!=givenArray[i-1]){
                return givenArray[i-1];
            }
            
            
        }
return givenArray[givenArray.length-1];
        
    }

    
    
        /*
        * much faster way of creating 
        */
    public List <Integer> convertToList(int[] tablica){
       List lista = new ArrayList(tablica.length);
        for (int i = 0; i < tablica.length; i++) {
            lista.add(tablica[i]);
        }
        return lista;
        
    }
    
    
public static void main(String[] args) {
    
     
    
    }
}
