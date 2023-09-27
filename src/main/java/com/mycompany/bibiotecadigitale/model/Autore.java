package com.mycompany.bibiotecadigitale.model;

public class Autore {
    public Autore(String codAutore, String nome, String cognome, String dataNascita, String luogoNascita) {
        this.codAutore = codAutore;
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.luogoNascita = luogoNascita;
    }

    public String getCodAutore() {
        return codAutore;
    }

    public void setCodAutore(String codAutore) {
        this.codAutore = codAutore;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(String dataNascita) {
        this.dataNascita = dataNascita;
    }

    public String getLuogoNascita() {
        return luogoNascita;
    }

    public void setLuogoNascita(String luogoNascita) {
        this.luogoNascita = luogoNascita;
    }

    private String codAutore;
    private String nome;

    private String cognome;
    private String dataNascita;
    private String luogoNascita;
    // Aggiungi costruttore, metodi getter e setter
}
