package com.mycompany.bibiotecadigitale.dao;

import com.mycompany.bibiotecadigitale.model.Utente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UtenteDAO {
    private Connection connection;

    public UtenteDAO() {
        connection = ConnectionManager.getConnection();
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
                String password = resultSet.getString("Password");
                Utente utente = new Utente(codice, nome, cognome, email, telefono, password);
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
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Utente (CodUtente, Nome, Cognome, Email, Telefono, Password) VALUES (?, ?, ?, ?, ?, ?)");
            preparedStatement.setInt(1, utente.getCodUtente());
            preparedStatement.setString(2, utente.getNome());
            preparedStatement.setString(3, utente.getCognome());
            preparedStatement.setString(4, utente.getEmail());
            preparedStatement.setLong(5, utente.getTelefono());
            preparedStatement.setString(6, utente.getPassword());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Gestisci l'eccezione
        }
    }

    public void updateUtente(Utente utente) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE Utente SET Nome=?, Cognome=?, Email=?, Telefono=?, Password=? WHERE CodUtente=?");
            preparedStatement.setString(1, utente.getNome());
            preparedStatement.setString(2, utente.getCognome());
            preparedStatement.setString(3, utente.getEmail());
            preparedStatement.setLong(4, utente.getTelefono());
            preparedStatement.setString(5, utente.getPassword());
            preparedStatement.setInt(6, utente.getCodUtente());
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
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT COUNT(*) FROM Utente WHERE CodUtente = ?");
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
}
