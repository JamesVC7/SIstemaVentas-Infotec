
package Modelo;

import Controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LoginDAO {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    
    public login log(String NomUsuario, String contraseña, int telefono){
        login l = new login();
        String sql = "SELECT * FROM empleado WHERE Nom_Usuario = ? AND Contraseña = ? AND Telefono = ? ";
        try{
            con= cn.getConnection();
            ps= con.prepareStatement(sql);
            ps.setString(1, NomUsuario);
            ps.setString(2, contraseña);
            ps.setInt(3, telefono);
               rs = ps.executeQuery();
            if(rs.next()){
                l.setId(rs.getInt("ID"));
                l.setNombre(rs.getString("Nombre"));
                l.setNomUsuario(rs.getString("Nom_Usuario"));
                l.setContraseña(rs.getString("contraseña"));
                l.setTelefono(rs.getInt("Telefono"));
            }
        }  catch(SQLException e){
            System.out.println(e.toString());
        }
        return l;
    }
}