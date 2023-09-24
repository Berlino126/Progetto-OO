package com.mycompany.bibiotecadigitale.model;

public class Utente {
    private int codUtente;
    private String nome;
    private String cognome;
    private String email;
    private long telefono;

    public Utente(int codUtente, String nome, String cognome, String email, long telefono) {
        this.codUtente = codUtente;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.telefono = telefono;
    }

    public int getCodUtente() {
        return codUtente;
    }

    public void setCodUtente(int codUtente) {
        this.codUtente = codUtente;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
}
