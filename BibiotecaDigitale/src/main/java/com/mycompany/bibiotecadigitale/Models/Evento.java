package com.mycompany.bibiotecadigitale.Models;

public class Evento {
    public Evento(String codEvento, String dataPresentazione, String codiceTesto) {
        this.codEvento = codEvento;
        this.dataPresentazione = dataPresentazione;
        this.codiceTesto = codiceTesto;
    }

    private String codEvento;

    public String getCodEvento() {
        return codEvento;
    }

    public void setCodEvento(String codEvento) {
        this.codEvento = codEvento;
    }

    public String getDataPresentazione() {
        return dataPresentazione;
    }

    public void setDataPresentazione(String dataPresentazione) {
        this.dataPresentazione = dataPresentazione;
    }

    public String getCodiceTesto() {
        return codiceTesto;
    }

    public void setCodiceTesto(String codiceTesto) {
        this.codiceTesto = codiceTesto;
    }

    private String dataPresentazione;
    private String codiceTesto;
    // Aggiungi costruttore, metodi getter e setter
}