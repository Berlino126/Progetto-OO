package main.java.com.mycompany.bibiotecadigitale.dao;

import main.java.com.mycompany.bibiotecadigitale.model.Utente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UtenteDAO {
    private Connection connection;

    public UtenteDAO() {
        // Inizializza la connessione al database qui
        String url = "jdbc:postgresql://localhost/Bible";
        String user = "postgres";
        String password = "francy09";
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
            // Gestisci l'eccezione
        }
    }

    public List<Utente> getAllUtenti() {
        List<Utente> utenti = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Utente");
            while (resultSet.next()) {
                int codice = resultSet.getInt("CodUtente");
                String nome = resultSet.getString("Nome");
                String cognome = resultSet.getString("Cognome");
                String email = resultSet.getString("Email");
                long telefono = resultSet.getLong("Telefono");
                //String password = resultSet.getString("Password");
                Utente utente = new Utente(codice, nome, cognome, email, telefono);
                utenti.add(utente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Gestisci l'eccezione
        }
        return utenti;
    }

    public void insertUtente(String Nome, String Cognome, String Email, long Telefono) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Utente (Nome, Cognome, Email, Telefono) VALUES (?, ?, ?, ?)");
            preparedStatement.setString(1, Nome);
            preparedStatement.setString(2, Cognome);
            preparedStatement.setString(3, Email);
            preparedStatement.setLong(4, Telefono);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Gestisci l'eccezione
        }
    }

    public void registerUtente(String Nome, String Cognome, String Email, long Telefono, String password) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Utente (Nome, Cognome, Email, Telefono, Password) VALUES (?, ?, ?, ?, ?)");
            preparedStatement.setString(1, Nome);
            preparedStatement.setString(2, Cognome);
            preparedStatement.setString(3, Email);
            preparedStatement.setLong(4, Telefono);
            preparedStatement.setString(5, password);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Gestisci l'eccezione
        }
    }

    public void updateUtente(String nome, String cognome, String email, long telefono) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE Utente SET Nome=?, Cognome=?, Email=?, Telefono=? WHERE CodUtente=?");
            preparedStatement.setString(1, nome);
            preparedStatement.setString(2, cognome);
            preparedStatement.setString(3, email);
            preparedStatement.setLong(4, telefono);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Gestisci l'eccezione
        }
    }

    public void deleteUtente(int codiceUtente) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM Utente WHERE CodUtente=?");
            preparedStatement.setInt(1, codiceUtente);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Gestisci l'eccezione
        }
    }

    public boolean utenteExists(int codice) {
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

    public boolean verificaCredenziali(int codiceUtente, String passwordUtente) {
        boolean credenzialiValide = false;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT COUNT(*) FROM Utente WHERE CodUtente = ? AND Password = ?");
            preparedStatement.setInt(1, codiceUtente);
            preparedStatement.setString(2, passwordUtente);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                credenzialiValide = count > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Gestisci l'eccezione
        }
        return credenzialiValide;
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
