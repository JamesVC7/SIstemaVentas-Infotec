
package Modelo;


public class login extends Usuario{
    private int id;
    private String NomUsuario;
    private String contraseña;
    private int telefono;
    
    public login(){
        
    }

    public login(int id, String NomUsuario, String contraseña, int telefono, String nombre) {
        super(nombre);
        this.id = id;
        this.NomUsuario = NomUsuario;
        this.contraseña = contraseña;
        this.telefono = telefono;
    } 
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomUsuario() {
        return NomUsuario;
    }

    public void setNomUsuario(String NomUsuario) {
        this.NomUsuario = NomUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
}
