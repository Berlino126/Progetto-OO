package com.mycompany.bibiotecadigitale.model;

public class Pubblicazione {
    public Pubblicazione(String codPubblicazione, String codiceTesto, String codiceResponsabile) {
        this.codPubblicazione = codPubblicazione;
        this.codiceTesto = codiceTesto;
        this.codiceResponsabile = codiceResponsabile;
    }

    private String codPubblicazione;

    public String getCodPubblicazione() {
        return codPubblicazione;
    }

    public void setCodPubblicazione(String codPubblicazione) {
        this.codPubblicazione = codPubblicazione;
    }

    public String getCodiceTesto() {
        return codiceTesto;
    }

    public void setCodiceTesto(String codiceTesto) {
        this.codiceTesto = codiceTesto;
    }

    public String getCodiceResponsabile() {
        return codiceResponsabile;
    }

    public void setCodiceResponsabile(String codiceResponsabile) {
        this.codiceResponsabile = codiceResponsabile;
    }

    private String codiceTesto;
    private String codiceResponsabile;
    // Aggiungi costruttore, metodi getter e setter
}
