package com.mycompany.bibiotecadigitale.model;

public class Richiesta {
    public Richiesta(String codiceLibreria, String codiceTesto) {
        this.codiceLibreria = codiceLibreria;
        this.codiceTesto = codiceTesto;
    }

    public String getCodiceLibreria() {
        return codiceLibreria;
    }

    public void setCodiceLibreria(String codiceLibreria) {
        this.codiceLibreria = codiceLibreria;
    }

    public String getCodiceTesto() {
        return codiceTesto;
    }

    public void setCodiceTesto(String codiceTesto) {
        this.codiceTesto = codiceTesto;
    }

    private String codiceLibreria;

    private String codiceTesto;
    // Aggiungi costruttore, metodi getter e setter
}