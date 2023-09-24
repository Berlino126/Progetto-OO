package com.mycompany.bibiotecadigitale.model;
import java.util.Date;
public class ArticoloScientifico extends Testo {
    private String universita;
    private String riassunto;

    public ArticoloScientifico(Integer codTesto, String titolo, Date annoPubblicazione, String edizione, boolean disponibilita, String formato, String tipologia, String universita, String riassunto) {
        super(codTesto, titolo, annoPubblicazione, edizione, disponibilita, formato, tipologia);
        this.universita = universita;
        this.riassunto = riassunto;
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
}
