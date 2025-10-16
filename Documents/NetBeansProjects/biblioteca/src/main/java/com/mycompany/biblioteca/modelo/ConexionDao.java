/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class ConexionDao {
    // 1. Declaración de variables de conexión
    private static final String URL = "jdbc:mysql://localhost:3306/libreria";
    private static final String USER = "root"; // Puede variar si usas Docker o XAMPP
    private static final String PASS = "cena2025."; // Contraseña de ejemplo en el video

    // Método para obtener la conexión
    public static Connection obtenerConexion() {
        Connection con = null;
        try {
            // Cargar el driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            // Establecer la conexión
            con = DriverManager.getConnection(URL, USER, PASS);
            
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el driver: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
        return con;
    }
    public static void main(String[] args) {
    try {
        Connection conn = ConexionDao.obtenerConexion(); // Llama al método de conexión
        
        if (conn != null) {
            System.out.println("Conexion a la base de datos es exitosa");
        } else {
            System.out.println("No se pudo establecer la conexion a la base de datos");
        }
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());}
    }

    static Connection ObtenerConexion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    }
    

    



    