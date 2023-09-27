package com.mycompany.bibiotecadigitale.dao;

import com.mycompany.bibiotecadigitale.model.ArticoloScientifico;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ArticoloScientificoDAO extends TestoDAO {

    public ArticoloScientificoDAO() {
        super();
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

    public void updateArticoloScientifico(ArticoloScientifico articolo) {
        updateTesto(articolo);

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "UPDATE ArticoloScientifico SET Universita = ?, Riassunto = ?, NomeRivista = ?, Argomento = ?, Responsabile = ?, LuogoConferenza = ?, DataConferenza = ? WHERE CodTesto = ?");
            preparedStatement.setString(1, articolo.getUniversita());
            preparedStatement.setString(2, articolo.getRiassunto());
            preparedStatement.setString(3, articolo.getNomeRivista());
            preparedStatement.setString(4, articolo.getArgomento());
            preparedStatement.setString(5, articolo.getResponsabile());
            preparedStatement.setString(6, articolo.getLuogoConferenza());
            preparedStatement.setDate(7, new java.sql.Date(articolo.getDataConferenza().getTime()));
            preparedStatement.setInt(8, articolo.getCodTesto());
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
