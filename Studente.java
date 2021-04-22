/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione1;

import java.io.Serializable;

/**
 *
 * @author yessabotrous
 */
public class Studente implements Serializable {

    private String nome;
    private String cognome;
    private int numeroRegistro;

    public Studente(int numeroRegistro, String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        this.numeroRegistro = numeroRegistro;
    }

    @Override
    public String toString() {
        return "Studente:  " + numeroRegistro + ", nome: " + nome + ", cognome: " + cognome;
    }

}
