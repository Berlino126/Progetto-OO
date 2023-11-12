package com.mycompany.bibiotecadigitale.model;

public class Utente {
    private int codUtente;
    private String nome;
    private String cognome;
    private String email;
    private long telefono;
    private String password; // Aggiunta dell'attributo password

    public Utente(int codUtente, String nome, String cognome, String email, long telefono, String password) {
        this.codUtente = codUtente;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.telefono = telefono;
        this.password = password; // Inizializzazione dell'attributo password
    }

    public int getCodUtente() {
        return codUtente;
    }


    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getEmail() {
        return email;
    }

    public long getTelefono() {
        return telefono;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
