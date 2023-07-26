<%-- 
    Document   : Index
    Created on : 12/07/2023, 11:27:23 a. m.
    Author     : jhon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="estilo.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Almacen</title>
    </head>
    <body>
        <br></br>
        <div class="box">
        <h1>Productos</h1>
        </div>
        <br /><br />
        <a href="ProductosController?accion=nuevo">Nuevo registro</a>
        
        <br /><br />
        <table class="table" border="1px">
            <thead>
                <tr>  
                    <th>Código</th>
                    <th>Nombre</th>
                    <th>Precio</th>
                    <th>Existencia</th>
                    <th></th>
                    <th></th>
                </tr>
            </thead>
            
            <tbody>
                <c:forEach var="producto" items="${lista}" >
                    <tr>
                        <td><c:out value="${producto.codigo}" /></td>
                        <td><c:out value="${producto.nombre}" /></td>
                        <td><c:out value="${producto.precio}" /></td>
                        <td><c:out value="${producto.existencia}" /></td>
                        <td><a href="ProductosController?accion=modificar&id=<c:out value="${producto.id}" />">Modificar</a></td>
                        <td><a href="ProductosController?accion=eliminar&id=<c:out value="${producto.id}" />">Eliminar</a></td>
                        
                        
                    </tr>
                    
                </c:forEach>
            </tbody>
                
            
        </table>
    </body>
</html>
