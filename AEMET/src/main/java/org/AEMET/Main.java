package org.AEMET;


import org.AEMET.services.database.DatabaseManager;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        try {
            DatabaseManager databaseManager = DatabaseManager.getInstance();
            Connection connection = databaseManager.getConnection();
            databaseManager.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}