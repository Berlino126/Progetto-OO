package com.mycompany.bibiotecadigitale.Models;
public class Testo {
    public Testo(String codTesto, String titolo, int annoPubblicazione, String formato, String edizione, boolean disponibilita) {
        this.codTesto = codTesto;
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.formato = formato;
        this.edizione = edizione;
        this.disponibilita = disponibilita;
    }

    public String getCodTesto() {
        return codTesto;
    }

    public void setCodTesto(String codTesto) {
        this.codTesto = codTesto;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getEdizione() {
        return edizione;
    }

    public void setEdizione(String edizione) {
        this.edizione = edizione;
    }

    public boolean isDisponibilita() {
        return disponibilita;
    }

    public void setDisponibilita(boolean disponibilita) {
        this.disponibilita = disponibilita;
    }

    private String codTesto;
    private String titolo;
    private int annoPubblicazione;
    private String formato;
    private String edizione;
    private boolean disponibilita;
    // Aggiungi costruttore, metodi getter e setter
}