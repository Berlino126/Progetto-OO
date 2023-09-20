package com.mycompany.bibiotecadigitale.Models;

public class Libro {
    public Libro(String codiceTesto, String genere, int capitoli, int pagine) {
        this.codiceTesto = codiceTesto;
        this.genere = genere;
        this.capitoli = capitoli;
        this.pagine = pagine;
    }

    public String getCodiceTesto() {
        return codiceTesto;
    }

    public void setCodiceTesto(String codiceTesto) {
        this.codiceTesto = codiceTesto;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public int getCapitoli() {
        return capitoli;
    }

    public void setCapitoli(int capitoli) {
        this.capitoli = capitoli;
    }

    public int getPagine() {
        return pagine;
    }

    public void setPagine(int pagine) {
        this.pagine = pagine;
    }

    private String codiceTesto;
    private String genere;
    private int capitoli;
    private int pagine;
    // Aggiungi costruttore, metodi getter e setter
}
