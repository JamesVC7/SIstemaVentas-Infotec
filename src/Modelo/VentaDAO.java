
package Modelo;
import Controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class VentaDAO implements metodoListar{
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
    public int RegistrarV (Venta v){
        String sql= "INSERT INTO ventas (DNI, Vendedor, Total) VALUES (?,?,?)";
        try {
        con= cn.getConnection();
        ps = con.prepareStatement(sql);
        ps.setInt(1, v.getDniV());
        ps.setString(2, v.getVend());
        ps.setDouble(3, v.getTotal());
        ps.execute();
        } catch(SQLException e) {
            System.out.println(e.toString());
        }finally{
            try{
                con.close();
            }catch(SQLException e) {
            System.out.println(e.toString());
         }
        }
        return r;
    }
    
    public int RegistrarD (DetalleV d){
        String sql= "INSERT INTO detalle_venta (ID_Producto, Cantidad, Precio, ID_Venta) VALUES (?,?,?,?)";
        try {
        con= cn.getConnection();
        ps = con.prepareStatement(sql);
        ps.setInt(1,d.getIdP() );
        ps.setInt(2,d.getCant() );
        ps.setDouble(3, d.getPrec());
        ps.setInt(4,d.getIdV() );
        ps.execute();
        } catch(SQLException e) {
            System.out.println(e.toString());
        }finally{
            try{
                con.close();
            }catch(SQLException e) {
            System.out.println(e.toString());
         }
        }
        return r;
    }
    
    public int IDV(){
        int idV = 0;
        String sql= "SELECT MAX(ID_Venta) FROM ventas";
        try {
        con= cn.getConnection();
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        if(rs.next()){
            idV = rs.getInt(1);
        }
        } catch(SQLException e) {
            System.out.println(e.toString());
        }
      return idV;
    }
    
    public boolean AStock (int cant, int idP){
        String sql= "UPDATE productos SET Stock=? WHERE ID_Producto=?";
        try {
        con= cn.getConnection();
        ps = con.prepareStatement(sql);
        ps.setInt(1, cant);
        ps.setInt(2, idP);
        ps.execute();
        return true;
        } catch(SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }
    
    public boolean EliminarV (int id_venta){
        String sql="DELETE FROM ventas WHERE ID_Venta = ?";
        try {   
            ps =con.prepareStatement(sql);
            ps.setInt(1, id_venta);
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
    
    @Override
    public List Listar (){
        List<Venta> ListaV = new ArrayList ();
        String sql="SELECT*FROM ventas";
        try{    
            con= cn.getConnection();
            ps= con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Venta v = new Venta();
                v.setIdVenta(rs.getInt("ID_Venta"));
                v.setDniV(rs.getInt("DNI"));
                v.setVend(rs.getString("Vendedor"));
                v.setTotal(rs.getDouble("Total"));
                ListaV.add(v);
            }
            
        }catch(SQLException e){
            System.out.println(e.toString());
        }
        return ListaV;
    }
}
