package org.AEMET;


import org.AEMET.services.database.DatabaseManager;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        try {
            // Obtén la instancia de DatabaseManager
            DatabaseManager databaseManager = DatabaseManager.getInstance();

            // Obtiene la conexión
            Connection connection = databaseManager.getConnection();

            // Realiza operaciones con la base de datos si es necesario

            // Cierra la conexión cuando hayas terminado
            databaseManager.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}