package com.mycompany.bibiotecadigitale.Models;
public class Libreria {


    public Libreria(String codLibreria, String nomeLibreria, int numeroTesti, String codiceUtente) {
        this.codLibreria = codLibreria;
        this.nomeLibreria = nomeLibreria;
        this.numeroTesti = numeroTesti;
        this.codiceUtente = codiceUtente;
    }

    public String getCodLibreria() {
        return codLibreria;
    }

    public void setCodLibreria(String codLibreria) {
        this.codLibreria = codLibreria;
    }

    public String getNomeLibreria() {
        return nomeLibreria;
    }

    public void setNomeLibreria(String nomeLibreria) {
        this.nomeLibreria = nomeLibreria;
    }

    public int getNumeroTesti() {
        return numeroTesti;
    }

    public void setNumeroTesti(int numeroTesti) {
        this.numeroTesti = numeroTesti;
    }

    public String getCodiceUtente() {
        return codiceUtente;
    }

    public void setCodiceUtente(String codiceUtente) {
        this.codiceUtente = codiceUtente;
    }

    private String codLibreria;
    private String nomeLibreria;
    private int numeroTesti;
    private String codiceUtente;
}
