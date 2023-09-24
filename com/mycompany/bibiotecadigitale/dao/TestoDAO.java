package com.mycompany.bibiotecadigitale.dao;
import com.mycompany.bibiotecadigitale.model.Testo;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestoDAO {
    protected Connection connection;

    public TestoDAO() {
        // Inizializza la connessione al database qui
        String url = "jdbc:postgresql://localhost/DatabaseOO";
        String user = "postgres";
        String password = "profbarra";
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
            // Gestisci l'eccezione
        }
    }

    public List<Testo> getAllTesti() {
        List<Testo> testi = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Testo");
            while (resultSet.next()) {
                Integer codice = resultSet.getInt("CodTesto");
                String titolo = resultSet.getString("Titolo");

                // Ottieni la data dal database come java.sql.Date
                java.sql.Date sqlDate = resultSet.getDate("AnnoPubblicazione");
                Date annoPubblicazione = new Date(sqlDate.getTime());

                String edizione = resultSet.getString("Edizione");
                boolean disponibilita = resultSet.getBoolean("Disponibilita");
                String formato = resultSet.getString("Formato");
                String tipologia = resultSet.getString("Tipologia");
                Testo testo = new Testo(codice, titolo, annoPubblicazione, edizione, disponibilita, formato, tipologia);
                testi.add(testo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Gestisci l'eccezione
        }
        return testi;
    }

    public void insertTesto(Testo testo) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Testo (CodTesto, Titolo, AnnoPubblicazione, Edizione, Disponibilita, Formato, Tipologia) VALUES (?, ?, ?, ?, ?, ?, ?)");
            preparedStatement.setInt(1, testo.getCodTesto());
            preparedStatement.setString(2, testo.getTitolo());

            // Converte la data in java.sql.Date prima di inserirla nel database
            java.sql.Date sqlDate = new java.sql.Date(testo.getAnnoPubblicazione().getTime());
            preparedStatement.setDate(3, sqlDate);

            preparedStatement.setString(4, testo.getEdizione());
            preparedStatement.setBoolean(5, testo.isDisponibilita());
            preparedStatement.setString(6, testo.getFormato());
            preparedStatement.setString(7, testo.getTipologia());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Gestisci l'eccezione
        }
    }
    public void deleteTesto(int codice) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM Testo WHERE CodTesto = ?");
            preparedStatement.setInt(1, codice);
            int rowsDeleted = preparedStatement.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println("Testo con codice " + codice + " eliminato con successo.");
            } else {
                System.out.println("Nessun testo con il codice " + codice + " trovato nel database.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Gestisci l'eccezione
        }
    }
    public void updateTesto(Testo testo) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "UPDATE Testo SET Titolo = ?, AnnoPubblicazione = ?, Edizione = ?, Disponibilita = ?, Formato = ?, Tipologia = ? WHERE CodTesto = ?");

            preparedStatement.setString(1, testo.getTitolo());

            // Converte la data in java.sql.Date prima di inserirla nel database
            java.sql.Date sqlDate = new java.sql.Date(testo.getAnnoPubblicazione().getTime());
            preparedStatement.setDate(2, sqlDate);

            preparedStatement.setString(3, testo.getEdizione());
            preparedStatement.setBoolean(4, testo.isDisponibilita());
            preparedStatement.setString(5, testo.getFormato());
            preparedStatement.setString(6, testo.getTipologia());
            preparedStatement.setInt(7, testo.getCodTesto());

            int rowsUpdated = preparedStatement.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Testo con codice " + testo.getCodTesto() + " aggiornato con successo.");
            } else {
                System.out.println("Nessun testo con il codice " + testo.getCodTesto() + " trovato nel database.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Gestisci l'eccezione
        }
    }


    // Altre operazioni CRUD e metodi accessori qui

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
