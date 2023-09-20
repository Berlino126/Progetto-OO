package com.mycompany.bibiotecadigitale.Models;

public class Produzione {
    public Produzione(String codiceTesto, String partitaIVA) {
        this.codiceTesto = codiceTesto;
        this.partitaIVA = partitaIVA;
    }
    private String codiceTesto;

    public String getCodiceTesto() {
        return codiceTesto;
    }

    public void setCodiceTesto(String codiceTesto) {
        this.codiceTesto = codiceTesto;
    }

    public String getPartitaIVA() {
        return partitaIVA;
    }

    public void setPartitaIVA(String partitaIVA) {
        this.partitaIVA = partitaIVA;
    }

    private String partitaIVA;
    // Aggiungi costruttore, metodi getter e setter
}
