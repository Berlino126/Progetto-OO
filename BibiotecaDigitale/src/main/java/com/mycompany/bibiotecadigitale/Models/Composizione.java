package com.mycompany.bibiotecadigitale.Models;

public class Composizione {

    public Composizione(String codiceTesto, String codiceCollana) {
        this.codiceTesto = codiceTesto;
        this.codiceCollana = codiceCollana;
    }

    public String getCodiceTesto() {
        return codiceTesto;
    }

    public void setCodiceTesto(String codiceTesto) {
        this.codiceTesto = codiceTesto;
    }

    public String getCodiceCollana() {
        return codiceCollana;
    }

    public void setCodiceCollana(String codiceCollana) {
        this.codiceCollana = codiceCollana;
    }

    private String codiceTesto;
    private String codiceCollana;
    // Aggiungi costruttore, metodi getter e setter
}