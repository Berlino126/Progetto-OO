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

    public void setStato(String stato) {
        Stato = stato;
    }

    public Integer getCodRichiesta() {
        return codRichiesta;
    }

    public void setCodRichiesta(Integer codRichiesta) {
        this.codRichiesta = codRichiesta;
    }

    public Date getDataRichiesta() {
        return dataRichiesta;
    }

    public void setDataRichiesta(Date dataRichiesta) {
        this.dataRichiesta = dataRichiesta;
    }

    public Integer getCodiceUtente() {
        return codiceUtente;
    }

    public void setCodiceUtente(Integer codiceUtente) {
        this.codiceUtente = codiceUtente;
    }

    public Integer getCodiceTesto() {
        return codiceTesto;
    }

    public void setCodiceTesto(Integer codiceTesto) {
        this.codiceTesto = codiceTesto;
    }
}
