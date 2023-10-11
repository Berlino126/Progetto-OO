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
    public void registerUtente(String Nome, String Cognome, String Email, long Telefono, String password) {
        try {
            // Ottenere il massimo valore di codUtente
            String getMaxCodUtenteQuery = "SELECT MAX(codUtente) FROM Utente";
            PreparedStatement maxCodUtenteStatement = connection.prepareStatement(getMaxCodUtenteQuery);
            ResultSet resultSet = maxCodUtenteStatement.executeQuery();

            int maxCodUtente = 0;
            if (resultSet.next()) {
                maxCodUtente = resultSet.getInt(1);
            }

            // Incrementare il massimo valore di codUtente di 1 per ottenere il nuovo valore
            int newCodUtente = maxCodUtente + 1;

            // Inserire il nuovo record con il nuovo valore di codUtente
            String insertQuery = "INSERT INTO Utente (codUtente, Nome, Cognome, Email, Telefono, Password) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setInt(1, newCodUtente);
            preparedStatement.setString(2, Nome);
            preparedStatement.setString(3, Cognome);
            preparedStatement.setString(4, Email);
            preparedStatement.setLong(5, Telefono);
            preparedStatement.setString(6, password);

            preparedStatement.executeUpdate();

            maxCodUtenteStatement.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            // Gestisci l'eccezione
        }
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
    public void updatePassword(int codiceUtente, String nuovaPassword) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE Utente SET Password=? WHERE CodUtente=?");
            preparedStatement.setString(1, nuovaPassword);
            preparedStatement.setInt(2, codiceUtente);
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
