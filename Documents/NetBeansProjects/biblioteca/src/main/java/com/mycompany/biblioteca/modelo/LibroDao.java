/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */


public class LibroDao {
    // Declaración de variables de instancia
    private Connection conn = null;
    private PreparedStatement stmt = null; 
    private ResultSet rs = null; 
    private ArrayList<Libro> lb;

    /**
     * Se crea un nuevo método que permite listar todos los libros registrados en la tabla libro.
     * @return Una lista de objetos Libro.
     */
    public ArrayList<Libro> ListarTodosLibros() {
        

        try {
            // Obtener la conexión
            conn = ConexionDao.ObtenerConexion(); 
            String sql = "SELECT * FROM  libro";
            stmt = conn.prepareStatement(sql);
            
            

            // Preparar la sentencia
            stmt = conn.prepareStatement(sql); 

            // Ejecutar la consulta y obtener el resultado
            rs = stmt.executeQuery(); 

            // usamos ciclo 
            while (rs.next()) {
                Libro libro = new Libro(); 
                libro.setId(rs.getInt("id_Libro"));  
                libro.setITitulo(rs.getString("titulo")); 
                 libro.setITitulo(rs.getString("autor"));
                  libro.setIPrecio(rs.getString("precio"));
                   libro.setITitulo(rs.getString("titulo"));
                   lb.add (libro); }
               
        } catch (SQLException e) {
        } finally {
            // CERRAR RECURSOS (Es el código que faltaba y es crucial)
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                // Manejo de error al cerrar la conexión

            }
        }
        return lb;
    }
}
     