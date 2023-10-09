package main.java.com.mycompany.bibiotecadigitale.dao;

import main.java.com.mycompany.bibiotecadigitale.model.ArticoloScientifico;
import main.java.com.mycompany.bibiotecadigitale.model.Libro;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ArticoloScientificoDAO extends TestoDAO {
    private static Connection connection;
    public ArticoloScientificoDAO() {
        super();
        connection = ConnectionManager.getConnection();
    }

    public static List<ArticoloScientifico> getAllArticolo() {
        List<ArticoloScientifico> articoli = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT A.*, T.Titolo, T.AnnoPubblicazione, T.Edizione, T.Disponibilita, T.Formato, T.Tipologia " +
                    "FROM ArticoloScientifico A " +
                    "JOIN Testo T ON A.CodTesto = T.CodTesto");
            while (resultSet.next()) {
                Integer codice = resultSet.getInt("codTesto");
                String universita = resultSet.getString("Universita");
                String argomento = resultSet.getString("Argomento");
                String nomeRivista = resultSet.getString("NomeRivista");
                String riassunto = resultSet.getString("Riassunto");
                String responsabile = resultSet.getString("Responsabile");
                String luogoConferenza = resultSet.getString("LuogoConferenza");
                java.sql.Date sqlDate = resultSet.getDate("DataConferenza");
                java.util.Date dataConferenza = new java.util.Date(sqlDate.getTime());

                String titolo = resultSet.getString("Titolo");
                java.sql.Date sqlDate2 = resultSet.getDate("AnnoPubblicazione");
                java.util.Date annoPubblicazione = new java.util.Date(sqlDate2.getTime());
                String edizione = resultSet.getString("Edizione");
                boolean disponibilita = resultSet.getBoolean("Disponibilita");
                String formato = resultSet.getString("Formato");
                String tipologia = resultSet.getString("Tipologia");


                ArticoloScientifico articolo = new ArticoloScientifico(codice, titolo, annoPubblicazione, edizione, disponibilita, formato, tipologia, universita, riassunto, nomeRivista, argomento, responsabile, luogoConferenza, dataConferenza);
                articoli.add(articolo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Gestisci l'eccezione
        }
        return articoli;
    }

    public void insertArticoloScientifico(ArticoloScientifico articolo) {
        insertTesto(articolo);

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO ArticoloScientifico (CodTesto, Universita, Riassunto, NomeRivista, Argomento, Responsabile, LuogoConferenza, DataConferenza) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
            preparedStatement.setInt(1, articolo.getCodTesto());
            preparedStatement.setString(2, articolo.getUniversita());
            preparedStatement.setString(3, articolo.getRiassunto());
            preparedStatement.setString(4, articolo.getNomeRivista());
            preparedStatement.setString(5, articolo.getArgomento());
            preparedStatement.setString(6, articolo.getResponsabile());
            preparedStatement.setString(7, articolo.getLuogoConferenza());
            preparedStatement.setDate(8, new java.sql.Date(articolo.getDataConferenza().getTime()));
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Gestisci l'eccezione
        }
    }

    public void updateArticoloScientifico(int codice, String universita, String riassunto, String nomeRivista, String argomento, String responsabile, String luogoConferenza, java.util.Date dataConferenza) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "UPDATE ArticoloScientifico SET Universita = ?, Riassunto = ?, NomeRivista = ?, Argomento = ?, Responsabile = ?, LuogoConferenza = ?, DataConferenza = ? WHERE CodTesto = ?");
            preparedStatement.setString(1, universita);
            preparedStatement.setString(2, riassunto);
            preparedStatement.setString(3, nomeRivista);
            preparedStatement.setString(4, argomento);
            preparedStatement.setString(5, responsabile);
            preparedStatement.setString(6, luogoConferenza);
            java.sql.Date sqlDate = new java.sql.Date(dataConferenza.getTime());
            preparedStatement.setDate(7, sqlDate);
            preparedStatement.setInt(8, codice);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Gestisci l'eccezione
        }
    }
    public void deleteArticoloScientifico(int codice) {
        try {
            // Elimina il record dalla tabella ArticoloScientifico
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM ArticoloScientifico WHERE CodTesto = ?");
            preparedStatement.setInt(1, codice);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Gestisci l'eccezione
        }

        // Chiamata alla funzione deleteTesto per eliminare il record dalla tabella Testo
        deleteTesto(codice);
    }

}
