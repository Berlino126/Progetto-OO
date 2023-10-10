package main.java.com.mycompany.bibiotecadigitale.model;

public class Utente {
    private int codUtente;
    private String nome;
    private String cognome;
    private String email;
    private long telefono;
    private String password;

    public Utente(int codice, String nome, String cognome, String email, long telefono) {
        this.codUtente = codice;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.telefono = telefono;
        this.password = password;
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
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
