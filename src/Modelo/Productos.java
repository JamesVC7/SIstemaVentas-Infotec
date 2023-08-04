
package Modelo;


public class Productos {
    private int id_producto;
    private String nombre_prod;
    private double precio;
    private int stock;
    private String categoria;
    
    public Productos(){
        
    }

    public Productos(int id_producto, String nombre_prod, double precio, int stock, String categoria) {
        this.id_producto = id_producto;
        this.nombre_prod = nombre_prod;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre_prod() {
        return nombre_prod;
    }

    public void setNombre_prod(String nombre_prod) {
        this.nombre_prod = nombre_prod;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
}
