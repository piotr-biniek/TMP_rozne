package Codility;

import java.util.Collections;
import java.util.HashSet;

public class SolutionIArrayOfInt {
    public int solution(int[] A) {
       
        HashSet<Integer> aSet = new HashSet<Integer>();

        for (int i = 0 ; i < A.length; i++) {
            aSet.add(A[i]);                     
        }



        for (int i = 1; ; i++) {
            if (!aSet.contains(i)) return i;
            
        }


    }
    
     
    
    
}

  