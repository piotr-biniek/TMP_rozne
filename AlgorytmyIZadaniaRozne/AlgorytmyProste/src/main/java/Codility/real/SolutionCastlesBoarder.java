/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codility.real;

/**
 *
 * @author piotr
 */

public class SolutionCastlesBoarder {

    int[] array = null;

    public int solution(int[] A) {
        array = A;

        if (array.length == 2) {
            if (array[0] == array[1]) {
                return 1;
            } else {
                return 2;
            }
        }
        int castles = 2;
        
 // zawsze będą 2 zamki na początku i na końcu granicy
 //  udało  się rozwiązac rzutem na tasme
 //ale strasznie  duzo czasu zmarnowałem na zad 3 :), kod jest dla mnie nieczytelny
 
        

        for (int i = 1; i < array.length; i++) {
            if (array[i-1]==array[i]) continue;
            if (isFromLeftHill(i) && isFromRightHill(i)) {
                castles++;
            }
            if (isFromLeftValley(i) && isFromRightValley(i)) {
                castles++;
            }

        }


        return castles;
    }

    private boolean isFromLeftHill(int i) {
        if ((i - 1) >= 0 && array[i - 1] < array[i]) {
            return true;
        }
        if ((i - 1) >= 0 && array[i - 1] == array[i]) {
            isFromLeftHill(i - 1);
        }
        return false;

    }

    private boolean isFromRightHill(int i) {
        if ((i + 1) < array.length && array[i + 1] < array[i]) {
            return true;
        }
        if ((i + 1) < array.length && array[i + 1] == array[i]) {
         return   isFromRightHill(i + 1);
        }
        return false;

    }

    private boolean isFromLeftValley(int i) {
        if ((i - 1) >= 0 && array[i - 1] > array[i]) {
            return true;
        }
        if ((i - 1) >= 0 && array[i - 1] == array[i]) {
            return isFromLeftValley(i - 1);
        }
        return false;

    }

    private boolean isFromRightValley(int i) {

        if ((i + 1) < array.length && array[i + 1] > array[i]) {
            return true;
        }
        if ((i + 1) < array.length && array[i + 1] == array[i]) {
            return isFromRightValley(i + 1);
        }
        return false;

    }


    public static void main(String a[]) {
        SolutionCastlesBoarder sol = new SolutionCastlesBoarder();
        int[] aaaa = {2, 2, 3, 4,4,4, 3, 3, 2, 2, 1,2,3,3,2, 1,1,  2, 5};
        System.out.println(sol.solution(aaaa));

    }
}
