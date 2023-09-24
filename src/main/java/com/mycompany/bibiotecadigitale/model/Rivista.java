package com.mycompany.bibiotecadigitale.model;

public class Rivista {
    public Rivista(String codicePubblicazione, String nome, String argomento, int numero, int annoPubblicazione, String responsabileRivista) {
        this.codicePubblicazione = codicePubblicazione;
        this.nome = nome;
        this.argomento = argomento;
        this.numero = numero;
        this.annoPubblicazione = annoPubblicazione;
        this.responsabileRivista = responsabileRivista;
    }

    private String codicePubblicazione;

    public String getCodicePubblicazione() {
        return codicePubblicazione;
    }

    public void setCodicePubblicazione(String codicePubblicazione) {
        this.codicePubblicazione = codicePubblicazione;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArgomento() {
        return argomento;
    }

    public void setArgomento(String argomento) {
        this.argomento = argomento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public String getResponsabileRivista() {
        return responsabileRivista;
    }

    public void setResponsabileRivista(String responsabileRivista) {
        this.responsabileRivista = responsabileRivista;
    }

    private String nome;
    private String argomento;
    private int numero;
    private int annoPubblicazione;
    private String responsabileRivista;
    // Aggiungi costruttore, metodi getter e setter
}
