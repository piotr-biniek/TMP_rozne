/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.biniek.zliczanieslowwpliku;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author piotr
 */
public class LicznikSlow {//todo

    Map<String, Integer> mapaSlow = new LinkedHashMap<>();

    public void zliczSlowa(String string) {
        if (string == null) {
            throw new NullPointerException("null String");
        }
        String stringPrime = StringUtils.trim(string);
        if (StringUtils.isNotEmpty(stringPrime)) {

            String stringBis = StringUtils.lowerCase(stringPrime);
            String[] tablicaStringow = StringUtils.split(stringBis);

            for (int i = 0; i < tablicaStringow.length; i++) {

                if (!mapaSlow.containsKey(tablicaStringow[i])) {
                    mapaSlow.put(tablicaStringow[i], +1);
                } else {
                    mapaSlow.put(tablicaStringow[i], ((int) mapaSlow.get(tablicaStringow[i])) + 1);
                }

            }

        }

    }

    public <String, Integer> Map liczbaSlow() {
        return mapaSlow;
        //string.

    }

    public Map<String, Integer> posortowanaLiczbaSlow() {

        List<Entry<String, Integer>> lista = new ArrayList<>(mapaSlow.entrySet());
        lista.sort(Entry.comparingByValue());

        LinkedHashMap<String, Integer> posortowanaMapa = new LinkedHashMap<>();
        for (Entry<String, Integer> entry : lista) {
            posortowanaMapa.put(entry.getKey(), entry.getValue());

        }

        return posortowanaMapa;
        //string.

    }

}
