package com.mycompany.bibiotecadigitale.dao;

import com.mycompany.bibiotecadigitale.model.LibreriaUtente;
import com.mycompany.bibiotecadigitale.model.Richiesta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class RichiestaDAO {
    private static Connection connection;

    public RichiestaDAO() {
        connection = ConnectionManager.getConnection();
    }
    public List<LibreriaUtente> getAllRichiesteLibreria(int codUtente) {
        List<LibreriaUtente> libreriaUtenteList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "SELECT * FROM LibreriaUtente WHERE CodiceUtente = ?");
            preparedStatement.setInt(1, codUtente);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int codiceRichiesta = resultSet.getInt("CodRichiesta");
                int codiceUtente = resultSet.getInt("CodiceUtente");
                Date dataRichiesta = resultSet.getDate("DataRichiesta");
                String stato = resultSet.getString("Stato");
                String titolo = resultSet.getString("Titolo");
                java.sql.Date sqlDate = resultSet.getDate("AnnoPubblicazione");
                Date annoPubblicazione = new Date(sqlDate.getTime());
                String edizione = resultSet.getString("Edizione");
                String formato = resultSet.getString("Formato");
                String tipologia = resultSet.getString("Tipologia");

                LibreriaUtente libreriaUtente = new LibreriaUtente(codiceRichiesta, codiceUtente, titolo, annoPubblicazione, edizione, formato, tipologia, dataRichiesta,  stato);
                libreriaUtenteList.add(libreriaUtente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return libreriaUtenteList;
    }
    public List<Richiesta> getAllRichieste(int codUtente) {
        List<Richiesta> richieste = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "SELECT CodRichiesta, DataRichiesta, CodiceUtente, CodiceTesto, Stato FROM Richiesta " +
                            "WHERE CodiceUtente = ?");
            preparedStatement.setInt(1, codUtente);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Integer codRichiesta = resultSet.getInt("CodRichiesta");
                Date dataRichiesta = resultSet.getDate("DataRichiesta");
                Integer codiceUtente = resultSet.getInt("CodiceUtente");
                Integer codiceTesto = resultSet.getInt("CodiceTesto");
                String stato = resultSet.getString("Stato");

                Richiesta richiesta = new Richiesta(codRichiesta, dataRichiesta, codiceUtente, codiceTesto, stato);
                richieste.add(richiesta);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Gestisci l'eccezione
        } /*finally {
            try {
                //connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
                // Gestisci l'eccezione
            }
        }*/
        return richieste;
    }

    public void insertRichiesta(int codUtente, int codTesto) {
        Connection connection = ConnectionManager.getConnection();
        try {
            // Ottieni il valore massimo di CodRichiesta dalla tabella
            PreparedStatement maxIdStatement = connection.prepareStatement(
                    "SELECT MAX(CodRichiesta) AS MaxCodRichiesta FROM Richiesta");
            ResultSet maxIdResult = maxIdStatement.executeQuery();
            int codRichiesta = 1; // Valore di default se non ci sono record nella tabella
            if (maxIdResult.next()) {
                codRichiesta = maxIdResult.getInt("MaxCodRichiesta") + 1;
            }

            // Imposta la data della richiesta come la data corrente
            Date dataRichiesta = new Date();

            // Imposta lo stato di default a "Valido"
            String stato = "Valido";

            PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO Richiesta (CodRichiesta, DataRichiesta, CodiceUtente, CodiceTesto, Stato) " +
                            "VALUES (?, ?, ?, ?, ?)");
            preparedStatement.setInt(1, codRichiesta);
            preparedStatement.setTimestamp(2, new java.sql.Timestamp(dataRichiesta.getTime()));
            preparedStatement.setInt(3, codUtente);
            preparedStatement.setInt(4, codTesto);
            preparedStatement.setString(5, stato);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Gestisci l'eccezione
        } /*finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
                // Gestisci l'eccezione
            }*/
    }
    public void close() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Gestisci l'eccezione
        }
    }
    public void deleteRichiesta(int codRichiesta) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "DELETE FROM Richiesta WHERE CodRichiesta = ?");
            preparedStatement.setInt(1, codRichiesta);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Gestisci l'eccezione
        }
    }
    public void updateRichiestaStatus() {
        Calendar oneMonthAgo = Calendar.getInstance();
        oneMonthAgo.add(Calendar.MONTH, -1);

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "UPDATE Richiesta SET Stato = 'Non Valido' " +
                            "WHERE DataRichiesta < ? AND Stato = 'Valido'");
            preparedStatement.setTimestamp(1, new java.sql.Timestamp(oneMonthAgo.getTimeInMillis()));
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Gestisci l'eccezione
        }
    }
}

