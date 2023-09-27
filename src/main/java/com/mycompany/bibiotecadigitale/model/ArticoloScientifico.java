package com.mycompany.bibiotecadigitale.model;

import java.util.Date;

public class ArticoloScientifico extends Testo {
    private String universita;
    private String riassunto;
    private String nomeRivista;
    private String argomento;
    private String responsabile;
    private String luogoConferenza;
    private Date dataConferenza;

    public ArticoloScientifico(Integer codTesto, String titolo, Date annoPubblicazione, String edizione, boolean disponibilita, String formato, String tipologia, String universita, String riassunto, String nomeRivista, String argomento, String responsabile, String luogoConferenza, Date dataConferenza) {
        super(codTesto, titolo, annoPubblicazione, edizione, disponibilita, formato, tipologia);
        this.universita = universita;
        this.riassunto = riassunto;
        this.nomeRivista = nomeRivista;
        this.argomento = argomento;
        this.responsabile = responsabile;
        this.luogoConferenza = luogoConferenza;
        this.dataConferenza = dataConferenza;
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

    public String getNomeRivista() {
        return nomeRivista;
    }

    public void setNomeRivista(String nomeRivista) {
        this.nomeRivista = nomeRivista;
    }

    public String getArgomento() {
        return argomento;
    }

    public void setArgomento(String argomento) {
        this.argomento = argomento;
    }

    public String getResponsabile() {
        return responsabile;
    }

    public void setResponsabile(String responsabile) {
        this.responsabile = responsabile;
    }

    public String getLuogoConferenza() {
        return luogoConferenza;
    }

    public void setLuogoConferenza(String luogoConferenza) {
        this.luogoConferenza = luogoConferenza;
    }

    public Date getDataConferenza() {
        return dataConferenza;
    }

    public void setDataConferenza(Date dataConferenza) {
        this.dataConferenza = dataConferenza;
    }
}

