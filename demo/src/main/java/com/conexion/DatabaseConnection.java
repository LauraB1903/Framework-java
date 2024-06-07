package com.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/nombre_basedatos";
        String user = "usuario";
        String password = "contraseña";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("¡Conexión exitosa!");
            // Aquí puedes realizar operaciones en la base de datos
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }
}

