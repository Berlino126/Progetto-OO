package com.mycompany.bibiotecadigitale.dao;

import com.mycompany.bibiotecadigitale.model.ArticoloScientifico;
import com.mycompany.bibiotecadigitale.model.Libro;
import com.mycompany.bibiotecadigitale.model.Testo;
import java.util.Date;
import java.util.List;

public interface TestoDAO {
    List<Testo> getAllTesti();
    void insertTesto(Testo testo);
    void deleteTesto(int codice);
    void updateTesto(Testo testo);
    boolean testoExists(int codice);
    List<Testo> getTestiByFormatoETipologia(String formato, String tipologia);
    int RichiediTesto(String titolo, String edizione, Date annoPubblicazione, String formato, String tipologia);
    boolean testoExistsWithSameAttributes(int codice, String titolo, Date annoPubblicazione, String edizione, boolean disponibilita, String formato, String tipologia);
    boolean isTestoAvailable(int codiceTesto);
    void close();
}
