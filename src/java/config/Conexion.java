/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    
    public Connection getConexion() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/almacen?serverTimezone=UTC";
            Connection conexion = DriverManager.getConnection(url, "root", "12345678");
            System.out.println("Conexion exitosa");
            return conexion;
            
        } catch(SQLException e) {
            System.out.println(e.toString());
            return null;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }                 
        return null;
        
    }
}
