package com.mycompany.bibiotecadigitale.dao;

import com.mycompany.bibiotecadigitale.model.Richiesta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RichiestaDAO {
    private static Connection connection;

    public RichiestaDAO() {
        connection = ConnectionManager.getConnection();
    }

    public static List<Richiesta> getAllRichieste() {
        List<Richiesta> richieste = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "SELECT CodRichiesta, DataRichiesta, CodiceUtente, CodiceTesto, Stato FROM Richiesta");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Integer codRichiesta = resultSet.getInt("CodRichiesta");
                Date dataRichiesta = resultSet.getDate("DataRichiesta");
                Integer codiceUtente = resultSet.getInt("CodiceUtente");
                Integer codiceTesto = resultSet.getInt("CodiceTesto");
                String stato = resultSet.getString("Stato"); // Aggiunto stato

                Richiesta richiesta = new Richiesta(codRichiesta, dataRichiesta, codiceUtente, codiceTesto, stato);
                richieste.add(richiesta);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Gestisci l'eccezione
        }
        return richieste;
    }

    public void insertRichiesta(Richiesta richiesta) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO Richiesta (CodRichiesta, DataRichiesta, CodiceUtente, CodiceTesto, Stato) VALUES (?, ?, ?, ?, ?)");
            preparedStatement.setInt(1, richiesta.getCodRichiesta());
            preparedStatement.setDate(2, new java.sql.Date(richiesta.getDataRichiesta().getTime()));
            preparedStatement.setInt(3, richiesta.getCodiceUtente());
            preparedStatement.setInt(4, richiesta.getCodiceTesto());
            preparedStatement.setString(5, richiesta.getStato());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Gestisci l'eccezione
        }
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
}

//NON SI PREVEDONO ELIMINAZIONI E MODIFICHE SULLE RICHIESTE
