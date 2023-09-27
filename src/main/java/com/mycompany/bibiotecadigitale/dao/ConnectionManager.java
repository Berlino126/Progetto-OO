package com.mycompany.bibiotecadigitale.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
    private static Connection connection;
    private static final String url = "jdbc:postgresql://localhost/DatabaseOO";
    private static final String user = "postgres";
    private static final String password = "profbarra";

    private ConnectionManager() {
        // Costruttore privato per evitare l'istanziazione diretta
    }

    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                e.printStackTrace();
                // Gestisci l'eccezione
            }
        }
        return connection;
    }

    public static void closeConnection() {
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
