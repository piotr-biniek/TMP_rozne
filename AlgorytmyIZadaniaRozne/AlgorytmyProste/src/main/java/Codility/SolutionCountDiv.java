/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codility;

/**
 *
 * @author piotr
 */
class SolutionCountDiv {// wolna wersja 0% performance

    // write your code in Java SE 8
    public int solution(int A, int B, int K) {
        // write your code in Java SE 8
    int wynik = 0;
       
        
        if( K>B){
            if(A==0) return 1;
            else return 0;
        }
        
        for (int i = A; i <=B; i++) {
            if(i%K==0) wynik++;
            
        }
        
        return wynik;
    }
}
