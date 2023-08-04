
package Modelo;

import Controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class ProductosDAO implements metodoListar {
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean RegistroProd (Productos p){
        String sql= "INSERT INTO productos (ID_Producto, Nombre_Prod, Categoria, Stock, Precio) VALUES (?,?,?,?,?)";
        try {
        con= cn.getConnection();
        ps = con.prepareStatement(sql);
        ps.setInt(1, p.getId_producto());
        ps.setString(2, p.getNombre_prod());
        ps.setString(3, p.getCategoria());
        ps.setInt(4, p.getStock());
        ps.setDouble(5, p.getPrecio());
        ps.execute();
        return true;
    } catch(SQLException e) {
        JOptionPane.showMessageDialog(null, e.toString());
        return false;
        }
    } 
    
    public void BoxCategoria (JComboBox cat){
        String sql = "SELECT Categoria_P From categoriaps";
        try {
            con= cn.getConnection();
            ps= con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                cat.addItem(rs.getString("Categoria_P"));
            }
        }catch(SQLException e){
            System.out.println(e.toString());
        }
    }
    
    @Override
    public List Listar (){
        List<Productos> ListaP = new ArrayList ();
        String sql="SELECT*FROM productos";
        try{    
            con= cn.getConnection();
            ps= con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Productos p = new Productos();
                p.setId_producto(rs.getInt("ID_Producto"));
                p.setNombre_prod(rs.getString("Nombre_Prod"));
                p.setCategoria(rs.getString("Categoria"));
                p.setStock(rs.getInt("Stock"));
                p.setPrecio(rs.getDouble("Precio"));
                ListaP.add(p);
            }
            
        }catch(SQLException e){
            System.out.println(e.toString());
        }
        return ListaP;
    }
    
    public boolean EliminarP (int id_producto){
        String sql="DELETE FROM productos WHERE ID_Producto = ?";
        try {   
            ps =con.prepareStatement(sql);
            ps.setInt(1, id_producto);
            ps.execute();
            return true;
            
        }catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
            System.out.println(e.toString());
            }
        }
    }
    
    public boolean ActualizarP (Productos p){
        String sql = "UPDATE productos SET Nombre_Prod = ?, Categoria = ?, Stock = ?, Precio = ?  WHERE ID_Producto = ?";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getNombre_prod());
            ps.setString(2, p.getCategoria());
            ps.setInt(3, p.getStock());
            ps.setDouble(4, p.getPrecio());
            ps.setInt(5, p.getId_producto());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.out.println(e.toString());
            return false;
       }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.out.println(e.toString());
            }
        }
    }
    
    public Productos BuscarP(int id_producto ){
        Productos p = new Productos();
        String sql ="SELECT * FROM productos WHERE ID_Producto = ?";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id_producto);
            rs = ps.executeQuery();
            if(rs.next()){
                p.setNombre_prod(rs.getString("Nombre_Prod"));
                p.setPrecio(rs.getDouble("Precio"));
                p.setCategoria(rs.getString("Categoria"));
                p.setStock(rs.getInt("Stock"));
            }
        }catch(SQLException e){
                System.out.println(e.toString());
        }
        return p;
    }
}
