/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codility;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 *
 * @author piotr only 33% wery week in efficency
 */
public class SolutionTapeEquilibrium {

    public int solution(int[] table) {
        if (table.length == 2) {
            return Math.abs(table[0] - table[1]);
        }
        if (table.length == 1) {
            return Math.abs(table[0]);
        }
        //  table.
        int[] tablePrim;
        int[] tableBis;
        int minimalDiff = Integer.MAX_VALUE;
        int tmp = Integer.MAX_VALUE;;

        for (int i = 0; i < table.length; i++) {
            if (table[i] < table.length) {
                tablePrim = new int[i];
                tableBis = new int[table.length - i];

                System.arraycopy(table, 0, tablePrim, 0, i);
                // System.out.println( Arrays.toString(tablePrim));
                System.arraycopy(table, i, tableBis, 0, table.length - i);
                // System.out.println(Arrays.toString(tableBis));

                tmp = this.getDifference(tablePrim, tableBis);
            }
            minimalDiff = (minimalDiff < tmp) ? minimalDiff : tmp;

        }
        return minimalDiff;
    }

    private int getDifference(int[] tablePrim, int[] tableBis) {
        int prime = IntStream.of(tablePrim).sum();
        //  System.out.println("/////////////////////////////////");
        //   System.out.println(Arrays.toString(tablePrim));
        //   System.out.println(prime);

        int bis = IntStream.of(tableBis).sum();
        // System.out.println(Arrays.toString(tableBis));
        // System.out.println(bis);

        return Math.abs(prime - bis);

    }

    public static void main(String[] args) {
        SolutionTapeEquilibrium ste = new SolutionTapeEquilibrium();
        int[] test = {3, 1, 2, 4, 3};
        System.out.println(ste.solution(test));

    }

}
