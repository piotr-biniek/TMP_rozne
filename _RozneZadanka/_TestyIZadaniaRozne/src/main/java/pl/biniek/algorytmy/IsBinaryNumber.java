/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.biniek.algorytmy;

/**
 *
 * @author piotr
 */
public class IsBinaryNumber {

    public boolean isBinaryNumber(int binaryNumber) {

        boolean test = true;
        int tmp = 0;
        while (true) {
            if (binaryNumber == 0) {
                break;
            }
            tmp = binaryNumber % 10;
            if (tmp > 1) {
                test = false;
                break;
            }
            binaryNumber=binaryNumber/10;

        }
        return test;
    }



}
