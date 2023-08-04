
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


public class ClienteDAO implements metodoListar {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean RegistroClient (Cliente c){
        String sql= "INSERT INTO cliente (DNI, Nombre_C, Telefono, Ciudad, Tipo) VALUES (?,?,?,?,?)";
        try {
        con= cn.getConnection();
        ps = con.prepareStatement(sql);
        ps.setInt(1, c.getDNI());
        ps.setString(2, c.getNombre());
        ps.setInt(3, c.getTelefono());
        ps.setString(4, c.getCiudad());
        ps.setString(5, c.getTipo());
        ps.execute();
        return true;
    } catch(SQLException e) {
        JOptionPane.showMessageDialog(null, e.toString());
        return false;
    }finally{
        try{
            con.close();
        }catch(SQLException e){
            System.out.println(e.toString());
        }
        }
    }
    
    public void BoxTipo (JComboBox tip){
        String sql = "SELECT Categoria_C From categoriasv";
        try {
            con= cn.getConnection();
            ps= con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                tip.addItem(rs.getString("Categoria_C"));
            }
        }catch(SQLException e){
            System.out.println(e.toString());
        }
    }
    
    @Override
    public List Listar (){
        List<Cliente> ListaCl = new ArrayList ();
        String sql="SELECT*FROM cliente";
        try{    
            con= cn.getConnection();
            ps= con.prepareStatement(sql);
            rs= ps.executeQuery();
            while(rs.next()){
                Cliente c= new Cliente();
                c.setDNI(rs.getInt("DNI"));
                c.setNombre(rs.getString("Nombre_C"));
                c.setTelefono(rs.getInt("Telefono"));
                c.setCiudad(rs.getString("Ciudad"));
                c.setTipo(rs.getString("Tipo"));
                ListaCl.add(c);
            }
            
        }catch(SQLException e){
            System.out.println(e.toString());
        }
        return ListaCl;
    }
    
    public boolean EliminarC (int dni){
        String sql="DELETE FROM cliente WHERE DNI = ?";
        try {   
            ps =con.prepareStatement(sql);
            ps.setInt(1, dni);
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
    
    public boolean ActualizarC (Cliente c){
        String sql = "UPDATE cliente SET Nombre_C = ?, Telefono = ?, Ciudad = ?, Tipo = ? WHERE DNI = ?";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, c.getNombre());
            ps.setInt(2, c.getTelefono());
            ps.setString(3, c.getCiudad());
            ps.setString(4, c.getTipo());
            ps.setInt(5, c.getDNI());
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
    
    public Cliente BuscarC (int dni){
        Cliente c = new Cliente();
        String sql = "SELECT * FROM cliente WHERE DNI=?";
        try{
            con= cn.getConnection();
            ps= con.prepareStatement(sql);
            ps.setInt(1, dni);
            rs= ps.executeQuery();
            if(rs.next()){
                c.setNombre(rs.getString("Nombre_C"));
                c.setTelefono(rs.getInt("Telefono"));
                c.setCiudad(rs.getString("Ciudad"));
                c.setTipo(rs.getString("Tipo"));
            }
        }catch(SQLException e){
             System.out.println(e.toString());
        }
        return c;
    }
}
