package com.mycompany.bibiotecadigitale.Models;

public class Scrittura {
    public Scrittura(String codiceTesto, String codiceAutore) {
        this.codiceTesto = codiceTesto;
        this.codiceAutore = codiceAutore;
    }

    public String getCodiceTesto() {
        return codiceTesto;
    }

    public void setCodiceTesto(String codiceTesto) {
        this.codiceTesto = codiceTesto;
    }

    public String getCodiceAutore() {
        return codiceAutore;
    }

    public void setCodiceAutore(String codiceAutore) {
        this.codiceAutore = codiceAutore;
    }

    private String codiceTesto;
    private String codiceAutore;
    // Aggiungi costruttore, metodi getter e setter
}