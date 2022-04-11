package es.avalon.objetos.ejemplo19;

public abstract class Compra {

    private double precio;
    private int id;
    private String concepto;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Compra(double precio, int id, String concepto) {
        this.precio = precio;
        this.id = id;
        this.concepto = concepto;
    }
}