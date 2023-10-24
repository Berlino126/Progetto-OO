package com.mycompany.bibiotecadigitale.dao;

import com.mycompany.bibiotecadigitale.model.LibreriaUtente;
import com.mycompany.bibiotecadigitale.model.Richiesta;

import java.util.List;

public interface RichiestaDAO {
    List<LibreriaUtente> getAllRichiesteLibreria(int codUtente);
    List<Richiesta> getAllRichieste(int codUtente);
    void insertRichiesta(int codUtente, int codTesto);
    void close();
    void deleteRichiesta(int codRichiesta);
    void updateRichiestaStatus();
}


