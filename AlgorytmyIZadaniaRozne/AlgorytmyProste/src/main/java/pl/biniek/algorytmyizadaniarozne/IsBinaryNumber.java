/*
 * Test czy podany ciąg cyfr jest liczbą binarną (0-1), uruchomienie przez twesty
 */
package pl.biniek.algorytmyizadaniarozne;

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
