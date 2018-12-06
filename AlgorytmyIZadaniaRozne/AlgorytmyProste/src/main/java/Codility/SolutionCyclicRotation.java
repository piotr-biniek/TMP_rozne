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
 class SolutionCR {

   
        // write your code in Java SE 8
    public int[] solution(int[] A, int K) {

        if (A.length == K) {
            return A;
        }

        int[] finalArray = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            finalArray[(i + K) % A.length] = A[i];
        }
        return finalArray;
    }



}
