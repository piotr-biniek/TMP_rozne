/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.biniek.zliczanieslowwpliku;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author piotr
 */
public class ZliczLicznoscSlow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {

        LicznikSlow ls = new LicznikSlow();

        ZliczLicznoscSlow zls = new ZliczLicznoscSlow();
        zls.zliczSlowaZPliku(ls);
        
        
        
        System.out.println(ls.posortowanaLiczbaSlow());

    }

    public void zliczSlowaZPliku(LicznikSlow licznik) throws FileNotFoundException, IOException{
        
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("tekst.txt")))) {
            String liniaTekstu = "";
            while ((liniaTekstu = br.readLine()) != null) {

                licznik.zliczSlowa(liniaTekstu);

            }
        }

    }
    
}
