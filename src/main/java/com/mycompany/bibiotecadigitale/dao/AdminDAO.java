package com.mycompany.bibiotecadigitale.dao;

import com.mycompany.bibiotecadigitale.model.Admin;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AdminDAO {
    private Connection connection;

    public AdminDAO() {
        connection = ConnectionManager.getConnection();
    }

    public List<Admin> getAllAdmins() {
        List<Admin> admins = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Admin");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                String password = resultSet.getString("password");
                Admin admin = new Admin(id, nome, password);
                admins.add(admin);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Gestisci l'eccezione
        }
        return admins;
    }

    public void insertAdmin(Admin admin) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Admin (id, nome, password) VALUES (?, ?, ?)");
            preparedStatement.setInt(1, admin.getId());
            preparedStatement.setString(2, admin.getNome());
            preparedStatement.setString(3, admin.getPassword());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Gestisci l'eccezione
        }
    }

    public void updateAdmin(Admin admin) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE Admin SET nome=?, password=? WHERE id=?");
            preparedStatement.setString(1, admin.getNome());
            preparedStatement.setString(2, admin.getPassword());
            preparedStatement.setInt(3, admin.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Gestisci l'eccezione
        }
    }

    public void deleteAdmin(int id) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM Admin WHERE id=?");
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Gestisci l'eccezione
        }
    }
    public boolean verificaCredenziali(int codiceUtente, String passwordUtente) {
        boolean credenzialiValide = false;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT COUNT(*) FROM Admin WHERE id = ? AND password = ?");
            preparedStatement.setInt(1, codiceUtente );
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
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE Admin SET Password=? WHERE id=?");
            preparedStatement.setString(1, nuovaPassword);
            preparedStatement.setInt(2, codiceUtente);
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
