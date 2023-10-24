package com.mycompany.bibiotecadigitale.dao;

import com.mycompany.bibiotecadigitale.model.ArticoloScientifico;

import java.util.List;

public interface ArticoloScientificoDAO {
    List<ArticoloScientifico> getAllArticolo();
    void insertArticoloScientifico(ArticoloScientifico articolo);
    void updateArticoloScientifico(int codice, String universita, String riassunto, String nomeRivista, String argomento, String responsabile, String luogoConferenza, java.util.Date dataConferenza);
    void deleteArticoloScientifico(int codice);

    void close();
}
