package es.avalon.colecciones.ejemplo9;


public class Factura {

    private String Articulo;
    private  String cantidad;
    private double precio;

    public String getArticulo() {
        return Articulo;
    }

    public void setArticulo(String articulo) {
        Articulo = articulo;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Factura(String articulo, String cantidad, double precio) {
        Articulo = articulo;
        this.cantidad = cantidad;
        this.precio = precio;
    }

}
