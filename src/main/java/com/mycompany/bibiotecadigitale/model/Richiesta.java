package com.mycompany.bibiotecadigitale.model;

import java.util.Date;

public class Richiesta {
    private Integer codRichiesta;
    private Date dataRichiesta;
    private Integer codiceUtente;
    private Integer codiceTesto;
    private String Stato;

    public Richiesta(Integer codRichiesta, Date dataRichiesta, Integer codiceUtente, Integer codiceTesto, String Stato) {
        this.codRichiesta = codRichiesta;
        this.dataRichiesta = dataRichiesta;
        this.codiceUtente = codiceUtente;
        this.codiceTesto = codiceTesto;
        this.Stato = Stato;
    }

    public String getStato() {
        return Stato;
    }

    public Integer getCodiceTesto() {
        return codiceTesto;
    }
}
