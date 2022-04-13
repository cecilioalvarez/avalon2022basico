package es.avalon.colecciones.ejercicio02Factura;

public class Factura {

    private int id;
    private String articulo;
    private double importe;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Factura(int id, String articulo, double importe) {
        this.id = id;
        this.articulo = articulo;
        this.importe = importe;
    }
}
