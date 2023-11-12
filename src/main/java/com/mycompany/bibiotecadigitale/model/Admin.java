package com.mycompany.bibiotecadigitale.model;
public class Admin {
    private int id;
    private String nome;
    private String password;

    public Admin(int id, String nome, String password) {
        this.id = id;
        this.nome = nome;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
