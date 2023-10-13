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
        connection = ConnectionManager.getConnection();
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
    public boolean testoExists(int codice) {
        boolean exists = false;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT COUNT(*) FROM Testo WHERE CodTesto = ?");
            preparedStatement.setInt(1, codice);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                exists = count > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Gestisci l'eccezione
        }
        return exists;
    }
    public List<Testo> getTestiByFormatoETipologia(String formato, String tipologia) {
        List<Testo> testi = new ArrayList<>();
        try {
            String query = "SELECT * FROM Testo WHERE Formato = ? AND Tipologia = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, formato);
            preparedStatement.setString(2, tipologia);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Integer codice = resultSet.getInt("CodTesto");
                String titolo = resultSet.getString("Titolo");

                // Ottieni la data dal database come java.sql.Date
                java.sql.Date sqlDate = resultSet.getDate("AnnoPubblicazione");
                Date annoPubblicazione = new Date(sqlDate.getTime());

                String edizione = resultSet.getString("Edizione");
                boolean disponibilita = resultSet.getBoolean("Disponibilita");

                Testo testo = new Testo(codice, titolo, annoPubblicazione, edizione, disponibilita, formato, tipologia);
                testi.add(testo);
            }

            //preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            // Gestisci l'eccezione
        }
        return testi;
    }
    public int RichiediTesto(String titolo, String edizione, Date annoPubblicazione, String formato, String tipologia) {
        int codiceTesto = -1; // Valore di default nel caso il testo non sia trovato

        try {
            String query = "SELECT CodTesto FROM Testo WHERE Titolo = ? AND Edizione = ? AND AnnoPubblicazione = ?  AND Formato = ? AND Tipologia = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, titolo);
            preparedStatement.setString(2, edizione);
            preparedStatement.setDate(3, new java.sql.Date(annoPubblicazione.getTime()));
            preparedStatement.setString(4, formato);
            preparedStatement.setString(5, tipologia);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                codiceTesto = resultSet.getInt("CodTesto");
            }

            //preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            // Gestisci l'eccezione
        }

        return codiceTesto;
    }


    public boolean testoExistsWithSameAttributes(int codice, String titolo, Date annoPubblicazione, String edizione, boolean disponibilita, String formato, String tipologia) {
        boolean exists = false;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT COUNT(*) FROM Testo WHERE Titolo = ? AND AnnoPubblicazione = ? AND Edizione = ? AND Disponibilita = ? AND Formato = ? AND Tipologia = ? AND CodTesto <> ?");
            preparedStatement.setString(1, titolo);
            preparedStatement.setDate(2, new java.sql.Date(annoPubblicazione.getTime()));
            preparedStatement.setString(3, edizione);
            preparedStatement.setBoolean(4, disponibilita);
            preparedStatement.setString(5, formato);
            preparedStatement.setString(6, tipologia);
            preparedStatement.setInt(7, codice);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                exists = count > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Gestisci l'eccezione
        }
        return exists;
    }

    public boolean isTestoAvailable(int codiceTesto) {
        boolean isAvailable = false;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT Disponibilita FROM Testo WHERE CodTesto = ?");
            preparedStatement.setInt(1, codiceTesto);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                isAvailable = resultSet.getBoolean("Disponibilita");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Gestisci l'eccezione
        }
        return isAvailable;
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