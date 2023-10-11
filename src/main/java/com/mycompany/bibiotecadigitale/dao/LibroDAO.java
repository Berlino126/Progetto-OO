package com.mycompany.bibiotecadigitale.dao;

import com.mycompany.bibiotecadigitale.model.Libro;
import com.mycompany.bibiotecadigitale.model.Testo;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LibroDAO extends TestoDAO {
    private static Connection connection;

    public LibroDAO() {
        super();
        connection = ConnectionManager.getConnection();
    }

    public static List<Libro> getAllLibri() {
        List<Libro> libri = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT L.*, T.Titolo, T.AnnoPubblicazione, T.Edizione, T.Disponibilita, T.Formato, T.Tipologia " +
                    "FROM Libro L " +
                    "JOIN Testo T ON L.CodTesto = T.CodTesto");
            while (resultSet.next()) {
                Integer codice = resultSet.getInt("codTesto");
                String genere = resultSet.getString("Genere");
                Integer pagine = resultSet.getInt("Pagine");
                Integer capitoli = resultSet.getInt("Capitoli");
                String evento = resultSet.getString("Evento");
                String collana = resultSet.getString("Collana");
                String titolo = resultSet.getString("Titolo");
                java.sql.Date sqlDate = resultSet.getDate("AnnoPubblicazione");
                Date annoPubblicazione = new Date(sqlDate.getTime());
                String edizione = resultSet.getString("Edizione");
                boolean disponibilita = resultSet.getBoolean("Disponibilita");
                String formato = resultSet.getString("Formato");
                String tipologia = resultSet.getString("Tipologia");

                Libro libro = new Libro(codice, titolo, annoPubblicazione, edizione, disponibilita, formato, tipologia, genere, capitoli, pagine, evento, collana);
                libri.add(libro);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Gestisci l'eccezione
        }
        return libri;
    }


    public void insertLibro(Libro libro) {
        insertTesto(libro);

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Libro (CodTesto, Genere, Capitoli, Pagine, Evento, Collana) VALUES (?, ?, ?, ?, ?, ?)");
            preparedStatement.setInt(1, libro.getCodTesto());
            preparedStatement.setString(2, libro.getGenere());
            preparedStatement.setInt(3, libro.getCapitoli());
            preparedStatement.setInt(4, libro.getPagine());
            preparedStatement.setString(5, libro.getEvento());
            preparedStatement.setString(6, libro.getCollana());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Gestisci l'eccezione
        }
    }

    // Aggiungi metodi per l'accesso agli attributi mancanti (EventoPresentazione e Collana) se necessario

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

    public void updateLibro(int codice, String genere, int capitoli, int pagine, String evento, String collana) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "UPDATE Libro SET Genere = ?, Capitoli = ?, Pagine = ?, Evento = ?, Collana = ? WHERE CodTesto = ?");
            preparedStatement.setString(1, genere);
            preparedStatement.setInt(2, capitoli);
            preparedStatement.setInt(3, pagine);
            preparedStatement.setString(4, evento);
            preparedStatement.setString(5, collana);
            preparedStatement.setInt(6, codice);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Gestisci l'eccezione
        }
    }
}