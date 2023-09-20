package com.mycompany.bibiotecadigitale.Models;

public class Conferenza {


    public Conferenza(String codicePubblicazione, String nome, String luogoConferenza, String dataInizio, String dataFine, String strutturaOrganizzatrice, String responsabile) {
        this.codicePubblicazione = codicePubblicazione;
        this.nome = nome;
        this.luogoConferenza = luogoConferenza;
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
        this.strutturaOrganizzatrice = strutturaOrganizzatrice;
        this.responsabile = responsabile;
    }
    private String codicePubblicazione;
    private String nome;

    public String getCodicePubblicazione() {
        return codicePubblicazione;
    }

    public void setCodicePubblicazione(String codicePubblicazione) {
        this.codicePubblicazione = codicePubblicazione;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLuogoConferenza() {
        return luogoConferenza;
    }

    public void setLuogoConferenza(String luogoConferenza) {
        this.luogoConferenza = luogoConferenza;
    }

    public String getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(String dataInizio) {
        this.dataInizio = dataInizio;
    }

    public String getDataFine() {
        return dataFine;
    }

    public void setDataFine(String dataFine) {
        this.dataFine = dataFine;
    }

    public String getStrutturaOrganizzatrice() {
        return strutturaOrganizzatrice;
    }

    public void setStrutturaOrganizzatrice(String strutturaOrganizzatrice) {
        this.strutturaOrganizzatrice = strutturaOrganizzatrice;
    }

    public String getResponsabile() {
        return responsabile;
    }

    public void setResponsabile(String responsabile) {
        this.responsabile = responsabile;
    }

    private String luogoConferenza;
    private String dataInizio;
    private String dataFine;
    private String strutturaOrganizzatrice;
    private String responsabile;
    // Aggiungi costruttore, metodi getter e setter
}