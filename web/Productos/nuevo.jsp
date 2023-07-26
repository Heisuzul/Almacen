<%-- 
    Document   : nuevo
    Created on : 12/07/2023, 11:27:52 a. m.
    Author     : jhon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>    
        <link rel="stylesheet" href="estilo.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Almacen</title>
    </head>
    <body>
        <br></br>       
        <h2 class="h2">Nuevo registro</h2>       
        <form class="input" action="ProductosController?accion=insertar" method="POST" autocomplete="off">
            
            <p>
                Código:
                <input id="codigo" name="codigo" type="text" />
            </p>
            <p>
                Nombre:
                <input id="nombre" name="nombre" type="text" />
            </p>
            <p>
                Precio:
                <input id="precio" name="precio" type="text" />
            </p>
            <p>
                Existencia:
                <input id="existencia" name="existencia" type="text" />
            </p>
            
            <button class="button" id="guardar" name="guardar" type="submit">Guardar</button>
        </form>
        
    </body>
</html>
