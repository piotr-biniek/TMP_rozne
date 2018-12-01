/*
 * Znajdowanie w ciągu arytmetycznym jednej zdublowanej liczby
 * uruchamianie w testach
 */
package pl.biniek.algorytmyizadaniarozne;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author piotr
 */
public class CiagZJednymDubletem {
    ///xxx

    /**
     *  Moja wersja
     *
     */
    public static int getDublet(List<Integer> lista) {
        if (lista == null) {
            throw new NullPointerException();
        }

        long sumaOczekiwana = (1 + lista.size()) * lista.size() / 2;
        long sumaCiagu = sumaRzeczywista(lista);

        int dublet = lista.size() - (int) (sumaOczekiwana - sumaCiagu);
        return dublet;

    }

    private static long sumaRzeczywista(List<Integer> lista) {
        long suma = 0;
        for (Integer integer : lista) {
            suma += integer;

        }
        return suma;
    }

    /**
     * Wersja ksiazkowa
     */
    public static int findDuplicateNumber(List<Integer> lista) {
        if (lista == null) {
            throw new NullPointerException();
        }
        int highestNumber = lista.size() - 1;
        int total = getSum(lista);
        int duplicate = total - (highestNumber * (highestNumber + 1) / 2);
        return duplicate;
    }

    private static int getSum(List<Integer> numbers) {

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static int findDuplicateNumberInFore(List<Integer> lista) {

        int prev = lista.get(0);
        Collections.sort(lista);
        for (int i = 1; i < lista.size(); i++) {
            if (prev == lista.get(i)) {
                return prev;
            } else {
                prev = lista.get(i);
            }

        }
        return 0;

    }

}
