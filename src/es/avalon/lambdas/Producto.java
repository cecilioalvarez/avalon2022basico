package es.avalon.lambdas;

public class Producto {


    private int numero;
    private String concepto;
    private double importe;
    private String categoria;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Producto(int numero, String concepto, double importe, String categoria) {
        this.numero = numero;
        this.concepto = concepto;
        this.importe = importe;
        this.categoria = categoria;
    }
}