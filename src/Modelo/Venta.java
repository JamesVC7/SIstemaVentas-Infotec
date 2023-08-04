
package Modelo;


public class Venta {
    private int idVenta;
    private int dniV;
    private String Vend;
    private double total;
    
    public Venta(){
        
    }

    public Venta(int idVenta, int dniV, String Vend, double total) {
        this.idVenta = idVenta;
        this.dniV = dniV;
        this.Vend = Vend;
        this.total = total;
    }


    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getDniV() {
        return dniV;
    }

    public void setDniV(int dniV) {
        this.dniV = dniV;
    }

    public String getVend() {
        return Vend;
    }

    public void setVend(String Vend) {
        this.Vend = Vend;
    }
    
    
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
}
