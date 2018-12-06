/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codility;
import java.util.Arrays;
import org.apache.commons.lang3.StringUtils;
/**
 *
 * @author piotr
 */
class SolutionBG {
   
    public int solution(int N) {
        // write your code in Java SE 8
        String binaryString = Integer.toBinaryString(N);
        String[] gaps=binaryString.split("1");
           System.out.println(binaryString);
        System.out.println(Arrays.toString(gaps));
        int zeros=0;
        for (int i = 0; i < gaps.length; i++) {
            if(zeros<gaps[i].length()&&(i+1)!=gaps.length)zeros=gaps[i].length();
            else if(zeros<gaps[i].length()&&((i+1)==gaps.length)&&(binaryString.charAt(binaryString.length()-1))=='1')zeros=gaps[i].length();
              
                            
        }
        return zeros;
    }
}