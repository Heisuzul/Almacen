/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import config.Conexion;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.SQLException;

/**
 *
 * @author jhon
 */
public class ProductosDAO {
    
    Connection conexion;
    
    public ProductosDAO(){
        Conexion con = new Conexion();
        conexion = con.getConexion();
    }
    
    public List<Productos> listarProductos(){
        
        PreparedStatement ps;
        ResultSet rs;      
        List<Productos> lista = new ArrayList<>();
        
        try{
            ps = conexion.prepareStatement("SELECT id, codigo, nombre, precio, existencia FROM productos");
            rs = ps.executeQuery();
            
            while(rs.next()) {
                
                int id = rs.getInt("id");
                String codigo = rs.getString("codigo");
                String nombre = rs.getString("nombre");
                Double precio = rs.getDouble("precio");
                int existencia = rs.getInt("existencia");
                
                Productos producto = new Productos(id,codigo,nombre,precio,existencia);
                lista.add(producto);
            }
            
            return lista;
            
        } catch(SQLException e) {
            System.out.println(e.toString());
            return null;
        }        
    }
    
    public Productos mostrarProducto(int idproducto){
        
        PreparedStatement ps;
        ResultSet rs;      
        Productos producto = null;
        
        try{
            ps = conexion.prepareStatement("SELECT id, codigo, nombre, precio, existencia FROM productos WHERE id=?");
            ps.setInt(1, idproducto);
            rs = ps.executeQuery();
            
            while(rs.next()) {
                
                int id = rs.getInt("id");
                String codigo = rs.getString("codigo");
                String nombre = rs.getString("nombre");
                Double precio = rs.getDouble("precio");
                int existencia = rs.getInt("existencia");
                
                producto = new Productos(id,codigo,nombre,precio,existencia);
            }
            
            return producto;
            
        } catch(SQLException e) {
            System.out.println(e.toString());
            return null;
        }        
    }
    
    public boolean insertar(Productos producto){
        
        PreparedStatement ps;
        
        try{
            ps = conexion.prepareStatement("INSERT INTO productos (codigo, nombre, precio, existencia) VALUES (?,?,?,?)");
            ps.setString(1, producto.getCodigo());
            ps.setString(2, producto.getNombre());
            ps.setDouble(3, producto.getPrecio());
            ps.setInt(4, producto.getExistencia());
            ps.execute();
         
            return true;
            
        } catch(SQLException e) {
            System.out.println(e.toString());
            return false;
        }        
    }
    
    public boolean actualizar(Productos producto){
        
        PreparedStatement ps;
        
        try{
            ps = conexion.prepareStatement("UPDATE productos SET codigo =?, nombre=?, precio=?, existencia=? WHERE id=?");
            ps.setString(1, producto.getCodigo());
            ps.setString(2, producto.getNombre());
            ps.setDouble(3, producto.getPrecio());
            ps.setInt(4, producto.getExistencia());
            ps.setInt(5, producto.getId());
            ps.execute();
         
            return true;
            
        } catch(SQLException e) {
            System.out.println(e.toString());
            return false;
        }        
    }
    
    public boolean eliminar(int idproducto){
        
        PreparedStatement ps;
        
        try{
            ps = conexion.prepareStatement("DELETE FROM productos WHERE id=?");
            ps.setInt(1, idproducto);
            ps.execute();
         
            return true;
            
        } catch(SQLException e) {
            System.out.println(e.toString());
            return false;
        }        
    }
}
