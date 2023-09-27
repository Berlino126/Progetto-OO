package com.mycompany.bibiotecadigitale.dao;

import com.mycompany.bibiotecadigitale.model.Libro;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LibroDAO extends TestoDAO {

    public LibroDAO() {
        super();
    }

    public void insertLibro(Libro libro) {
        insertTesto(libro);

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Libro (CodTesto, Genere, Capitoli, Pagine) VALUES (?, ?, ?, ?)");
            preparedStatement.setInt(1, libro.getCodTesto());
            preparedStatement.setString(2, libro.getGenere());
            preparedStatement.setInt(3, libro.getCapitoli());
            preparedStatement.setInt(4, libro.getPagine());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Gestisci l'eccezione
        }
    }
    public void deleteLibro(int codice) {
        try {
            // Elimina il record dalla tabella Libro
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM Libro WHERE CodTesto = ?");
            preparedStatement.setInt(1, codice);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Gestisci l'eccezione
        }
        // Chiamata alla funzione deleteTesto per eliminare il record dalla tabella Testo
        deleteTesto(codice);
    }
    public void updateLibro(Libro libro) {
        updateTesto(libro);

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "UPDATE Libro SET Genere = ?, Capitoli = ?, Pagine = ? WHERE CodTesto = ?");
            preparedStatement.setString(1, libro.getGenere());
            preparedStatement.setInt(2, libro.getCapitoli());
            preparedStatement.setInt(3, libro.getPagine());
            preparedStatement.setInt(4, libro.getCodTesto());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Gestisci l'eccezione
        }
    }
}
