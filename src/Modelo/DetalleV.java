
package Modelo;


public class DetalleV {
    private int idP;
    private int cant;
    private double prec;
    private int idV;
    
    public DetalleV(){
        
    }

    public DetalleV(int idP, int cant, double prec, int idV) {
        this.idP = idP;
        this.cant = cant;
        this.prec = prec;
        this.idV = idV;
    }

    public int getIdP() {
        return idP;
    }

    public void setIdP(int idP) {
        this.idP = idP;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public double getPrec() {
        return prec;
    }

    public void setPrec(double prec) {
        this.prec = prec;
    }

    public int getIdV() {
        return idV;
    }

    public void setIdV(int idV) {
        this.idV = idV;
    }
    
}
