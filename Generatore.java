/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yessabotrous
 */
public class Generatore implements Runnable {

    public int generaNumero() {
        return (int) (Math.random() * 31) + 1;
    }

    public String generaNome() {
        String[] nome = {"Yessa", "Luca", "Paolo", "Mattia", "Federico"};
        return nome[(int) (Math.random() * 5)];
    }

    public String generaCognome() {
        String[] cognome = {"Botrous", "Berto", "Zileo", "Ronaldo", "Kenzo"};
        return cognome[(int) (Math.random() * 5)];
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            try {
                Studente s = new Studente(generaNumero(), generaNome(), generaCognome());
                System.out.println("Thread: " + i + "   " + s.toString());
                Thread.sleep(1000);
                i++;
            } catch (InterruptedException ex) {
                Logger.getLogger(Generatore.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
