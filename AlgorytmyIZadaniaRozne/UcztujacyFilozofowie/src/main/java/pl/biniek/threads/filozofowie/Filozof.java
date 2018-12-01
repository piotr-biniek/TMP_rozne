/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.biniek.threads.filozofowie;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author piotr
 */
public class Filozof extends Thread {

    private Widelec lewyWidelec;
    private Widelec prawyWidelec;
    private int numerFilozofa = 0;
    private static int nrFilozofaGlobalny = 1;

    public Filozof() {
        numerFilozofa = nrFilozofaGlobalny;
        nrFilozofaGlobalny++;

    }

    public void setLewyWidelec(Widelec lewyWidelec) {
        this.lewyWidelec = lewyWidelec;
    }

    public void setPrawyWidelec(Widelec prawyWidelec) {
        this.prawyWidelec = prawyWidelec;
    }

    @Override
    public void run() {
        while (!this.interrupted()) {
            try {

                mysle();
                jem();

            } catch (InterruptedException ex) {
                Logger.getLogger(Filozof.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void mysle() throws InterruptedException {
        this.sleep(((long) (Math.random() * 25)));

    }

    public void jem() {

        synchronized (lewyWidelec) {
            lewyWidelec.wykonajAkcję(numerFilozofa);
            synchronized (prawyWidelec) {
                prawyWidelec.wykonajAkcję(numerFilozofa);
            }
        }
    }

}
