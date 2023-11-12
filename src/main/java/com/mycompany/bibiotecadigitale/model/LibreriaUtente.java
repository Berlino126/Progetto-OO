package com.mycompany.bibiotecadigitale.model;
import java.util.Date;
public class LibreriaUtente {
    private int CodiceRichiesta;
    private int CodiceUtente;
    private String Titolo;
    private Date AnnoPubblicazione;
    private String Formato;
    private String Edizione;
    private String Tipologia;
    private Date dataRichiesta;
    private String Stato;

    public LibreriaUtente(int codiceRichiesta, int codiceUtente, String titolo, Date annoPubblicazione, String formato, String edizione, String tipologia, Date dataRichiesta, String stato) {
        this.CodiceRichiesta = codiceRichiesta;
        this.CodiceUtente = codiceUtente;
        this.Titolo = titolo;
        this.AnnoPubblicazione = annoPubblicazione;
        this.Formato = formato;
        this.Edizione = edizione;
        this.Tipologia = tipologia;
        this.dataRichiesta = dataRichiesta;
        this.Stato = stato;
    }

    public int getCodiceRichiesta() {
        return CodiceRichiesta;
    }

    public String getTitolo() {
        return Titolo;
    }

    public void setTitolo(String titolo) {
        Titolo = titolo;
    }

    public Date getAnnoPubblicazione() {
        return AnnoPubblicazione;
    }

    public void setAnnoPubblicazione(Date annoPubblicazione) {
        this.AnnoPubblicazione = annoPubblicazione;
    }

    public String getFormato() {
        return Formato;
    }

    public void setFormato(String formato) {
        Formato = formato;
    }

    public String getEdizione() {
        return Edizione;
    }

    public void setEdizione(String edizione) {
        Edizione = edizione;
    }

    public String getTipologia() {
        return Tipologia;
    }

    public void setTipologia(String tipologia) {
        Tipologia = tipologia;
    }

    public Date getDataRichiesta() {
        return dataRichiesta;
    }

    public String getStato() {
        return Stato;
    }

}