package com.mycompany.bibiotecadigitale.Models;

public class ArticoloScientifico {
    public ArticoloScientifico(String codiceTesto, String universita, String riassunto) {
        this.codiceTesto = codiceTesto;
        this.universita = universita;
        this.riassunto = riassunto;
    }

    private String codiceTesto;

    public String getCodiceTesto() {
        return codiceTesto;
    }

    public void setCodiceTesto(String codiceTesto) {
        this.codiceTesto = codiceTesto;
    }

    public String getUniversita() {
        return universita;
    }

    public void setUniversita(String universita) {
        this.universita = universita;
    }

    public String getRiassunto() {
        return riassunto;
    }

    public void setRiassunto(String riassunto) {
        this.riassunto = riassunto;
    }

    private String universita;
    private String riassunto;
    // Aggiungi costruttore, metodi getter e setter
}