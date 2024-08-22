package com.scripts.sdexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnect {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/sd_exam";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "Vfd77vvt44941070";

    // Establishing database connection
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }
}
