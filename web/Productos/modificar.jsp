<%-- 
    Document   : modificar
    Created on : 12/07/2023, 11:28:12 a. m.
    Author     : jhon
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="estilo.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <br /><br />
         <h2>Modificar registro</h2>
        
        <form action="ProductosController?accion=actualizar" method="POST" autocomplete="off">
            
            <input id="id" name="id" type="hidden" value="<c:out value="${producto.id}" />" />
            
            <p>
                Código:
                <input id="codigo" name="codigo" type="text" value="<c:out value="${producto.codigo}" />" />
            </p>
            <p>
                Nombre:
                <input id="nombre" name="nombre" type="text" value="<c:out value="${producto.nombre}" />" />
            </p>
            <p>
                Precio:
                <input id="precio" name="precio" type="text" value="<c:out value="${producto.precio}" />" />
            </p>
            <p>
                Existencia:
                <input id="existencia" name="existencia" type="text" value="<c:out value="${producto.existencia}" />" />
            </p>
            
            <button class="button" id="guardar" name="guardar" type="submit">Guardar</button>
        </form>
    </body>
</html>
