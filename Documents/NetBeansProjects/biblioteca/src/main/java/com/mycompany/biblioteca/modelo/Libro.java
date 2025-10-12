/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca.modelo;

/**
 *
 * @author Usuario
 */
public class Libro {
    
    // ----------------------------------------------------
    // Atributos de Clase (se ajustan al uso del DAO)
    // Se renombra 'id' a 'idLibro' y se añade 'isbn'
    // Se asume 'genero' como String
    // ----------------------------------------------------
    private int idLibro;
    private String isbn; 
    private String titulo;
    private String autor;
    private String genero; // Corregido el tipo de 'float' a 'String' (o 'int' si es un ID)

    // ----------------------------------------------------
    // Constructor Vacío (necesario para el DAO)
    // ----------------------------------------------------
    public Libro() {
        // Constructor vacío (por defecto)
    }

    // ----------------------------------------------------
    // Constructor con parámetros útiles (Opcional, pero recomendado)
    // ----------------------------------------------------
    public Libro(int idLibro, String isbn, String titulo, String autor, String genero) {
        this.idLibro = idLibro;
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }

    // ----------------------------------------------------
    // Getters y Setters
    // ----------------------------------------------------

    // --- Métodos que tu DAO estaba usando (se implementan correctamente) ---

    // Este método setIdLibro() se implementó usando el atributo 'idLibro'
    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }
    
    // Este método setIsbn() se implementó usando el atributo 'isbn'
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    // --- Métodos existentes, corregidos para usar 'idLibro' ---

    public int getIdLibro() {
        return idLibro;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    // El método getId() ya no es necesario si usas getIdLibro()
    // El método setId(int id) ya no es necesario si usas setIdLibro(int id)

    void setI(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setId(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setITitulo(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setIPrecio(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     
    }

   
    
    
    

    

