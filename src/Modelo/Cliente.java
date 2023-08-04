
package Modelo;


public class Cliente extends Usuario{
    private int DNI;
    private int telefono;
    private String ciudad;
    private String tipo;
    
    public Cliente(){
        
    }

    public Cliente(int DNI, String nombre,int telefono, String ciudad, String tipo ) {
        super(nombre);
        this.DNI = DNI;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.tipo = tipo;
    }


    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
 
    
}
