package com.mycompany.bibiotecadigitale.model;
import java.util.Date;

public class Libro extends Testo {
    private String genere;
    private int capitoli;
    private int pagine;
    private String evento;
    private String collana;

    public Libro(Integer codTesto, String titolo, Date annoPubblicazione, String edizione, boolean disponibilita, String formato, String tipologia, String genere, int capitoli, int pagine, String evento, String collana) {
        super(codTesto, titolo, annoPubblicazione, edizione, disponibilita, formato, tipologia);
        this.genere = genere;
        this.capitoli = capitoli;
        this.pagine = pagine;
        this.evento = evento;
        this.collana = collana;
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

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getCollana() {
        return collana;
    }

    public void setCollana(String collana) {
        this.collana = collana;
    }
}
