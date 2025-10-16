<%-- 
    Document   : vistal
    Created on : 9/10/2025, 8:15:00 p. m.
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<!doctype html>
  
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
     <title>Biblioteca | Nuevo Libro</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
  
  
       <body style="background:#f7f7f7;">
    <div class="container">
        <div class="card mt-4">
            <h2 class="text-center">Biblioteca Nacional de Colombia</h2>
            <hr>
            <a href="Controlador?accion=nuevo" class="btn btn-success btn-sm">Nuevo Libro</a>
            <br><br>

            <table class="table table-striped table-hover">
                <thead class="thead-dark">
                    <tr>
                        <th>ID</th>
                        <th>Título</th>
                        <th>Autor</th>
                        <th>Precio</th>
                       
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${libros}" var="item">
                        <tr>
                            <td>${item.id}</td>
                            <td>${item.titulo}</td>
                            <td>${item.autor}</td>
                            <td>${item.precio}</td>
                            
                                <a href="Controlador?accion=editar&id=${item.id}" class="btn btn-warning btn-sm">Editar</a>
                                <a href="Controlador?accion=eliminar&id=${item.id}" class="btn btn-danger btn-sm">Eliminar</a>
                            
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js" integrity="sha384-ndDqU0Gzau9qJ1lfW4pNLlhNTkCfHzAVBReH9diLvGRem5+R9g2FzA8ZGN954O5Q" crossorigin="anonymous"></script>
  
  

   
