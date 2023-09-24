package com.mycompany.bibiotecadigitale.dao;

import com.mycompany.bibiotecadigitale.model.Utente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UtenteDAO {
    private Connection connection;

    public UtenteDAO() {
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
                Utente utente = new Utente(codice, nome, cognome, email, telefono);
                utenti.add(utente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Gestisci l'eccezione
        }
        return utenti;
    }

    public void insertUtente(Utente utente) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Utente (CodUtente, Nome, Cognome, Email, Telefono) VALUES (?, ?, ?, ?, ?)");
            preparedStatement.setInt(1, utente.getCodUtente());
            preparedStatement.setString(2, utente.getNome());
            preparedStatement.setString(3, utente.getCognome());
            preparedStatement.setString(4, utente.getEmail());
            preparedStatement.setLong(5, utente.getTelefono());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Gestisci l'eccezione
        }
    }

    public void updateUtente(Utente utente) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE Utente SET Nome=?, Cognome=?, Email=?, Telefono=? WHERE CodUtente=?");
            preparedStatement.setString(1, utente.getNome());
            preparedStatement.setString(2, utente.getCognome());
            preparedStatement.setString(3, utente.getEmail());
            preparedStatement.setLong(4, utente.getTelefono());
            preparedStatement.setInt(5, utente.getCodUtente());
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
