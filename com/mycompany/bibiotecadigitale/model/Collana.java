package com.mycompany.bibiotecadigitale.model;

public class Collana {
    public Collana(String codCollana, String nome, String disciplina, String edizCollana, String descrizione) {
        this.codCollana = codCollana;
        this.nome = nome;
        this.disciplina = disciplina;
        this.edizCollana = edizCollana;
        this.descrizione = descrizione;
    }

    public String getCodCollana() {
        return codCollana;
    }

    public void setCodCollana(String codCollana) {
        this.codCollana = codCollana;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getEdizCollana() {
        return edizCollana;
    }

    public void setEdizCollana(String edizCollana) {
        this.edizCollana = edizCollana;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    private String codCollana;
    private String nome;
    private String disciplina;
    private String edizCollana;
    private String descrizione;
    // Aggiungi costruttore, metodi getter e setter
}