/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yessabotrous
 */
public class Serializzazione {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Studente s = new Studente("Cristian", "Nicola", 18);

        try {
            FileOutputStream FO = new FileOutputStream("test.ser");
            ObjectOutputStream OS = new ObjectOutputStream(FO);
            OS.writeObject(9);
            OS.writeObject("ciao");
            OS.writeObject(0.345);
            OS.flush();
            OS.close();
            FO.close();
            FileInputStream FI = new FileInputStream("test.ser");
            ObjectInputStream IS = new ObjectInputStream(FI);

            int v1 = (int) IS.readObject();
            System.out.println(v1);

            String v2 = (String) IS.readObject();
            System.out.println(v2);

            float v3 = (float) (double) IS.readObject();
            System.out.println(v3);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Serializzazione.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Serializzazione.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Serializzazione.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
