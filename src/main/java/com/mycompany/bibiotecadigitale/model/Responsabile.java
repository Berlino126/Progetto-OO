package com.mycompany.bibiotecadigitale.model;

public class Responsabile {
    public Responsabile(String codResponsabile, String nome, String cognome) {
        this.codResponsabile = codResponsabile;
        this.nome = nome;
        this.cognome = cognome;
    }

    public String getCodResponsabile() {
        return codResponsabile;
    }

    public void setCodResponsabile(String codResponsabile) {
        this.codResponsabile = codResponsabile;
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

    private String codResponsabile;
    private String nome;
    private String cognome;
    // Aggiungi costruttore, metodi getter e setter
}
