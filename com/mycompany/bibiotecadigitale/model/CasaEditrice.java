package com.mycompany.bibiotecadigitale.model;

public class CasaEditrice {

    public CasaEditrice(String PIVA, String nome) {
        this.PIVA = PIVA;
        this.nome = nome;
    }

    public String getPIVA() {
        return PIVA;
    }

    public void setPIVA(String PIVA) {
        this.PIVA = PIVA;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String PIVA;

    private String nome;
    // Aggiungi costruttore, metodi getter e setter
}