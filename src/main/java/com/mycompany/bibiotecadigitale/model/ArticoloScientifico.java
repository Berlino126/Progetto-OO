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

    public String getRiassunto() {
        return riassunto;
    }

    public String getNomeRivista() {
        return nomeRivista;
    }

    public String getArgomento() {
        return argomento;
    }

    public String getResponsabile() {
        return responsabile;
    }

    public String getLuogoConferenza() {
        return luogoConferenza;
    }

    public Date getDataConferenza() {
        return dataConferenza;
    }

}
