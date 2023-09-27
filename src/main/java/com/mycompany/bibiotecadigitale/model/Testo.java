package com.mycompany.bibiotecadigitale.model;

import java.util.Date;

public class Testo {
    private Integer codTesto;
    private String titolo;
    private Date annoPubblicazione;
    private String formato;
    private String edizione;
    private boolean disponibilita;
    private String tipologia;

    public Testo(Integer codTesto, String titolo, Date annoPubblicazione, String edizione, boolean disponibilita, String formato, String tipologia) {
        this.codTesto = codTesto;
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.formato = formato;
        this.edizione = edizione;
        this.disponibilita = disponibilita;
        this.tipologia = tipologia;
    }

    public Integer getCodTesto() {
        return codTesto;
    }

    public void setCodTesto(Integer codTesto) {
        this.codTesto = codTesto;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    // Aggiorna i metodi getter e setter per l'annoPubblicazione
    public Date getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(Date annoPubblicazione) {
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

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }
}
