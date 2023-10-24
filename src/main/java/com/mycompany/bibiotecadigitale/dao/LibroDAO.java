package com.mycompany.bibiotecadigitale.dao;

import com.mycompany.bibiotecadigitale.model.Libro;

import java.util.List;

public interface LibroDAO {
    List<Libro> getAllLibri();
    void insertLibro(Libro libro);
    void updateLibro(int codice, String genere, int capitoli, int pagine, String evento, String collana);
    void deleteLibro(int codice);

    void close();
}
