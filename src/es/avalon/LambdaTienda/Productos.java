package es.avalon.LambdaTienda;

public class Productos {

    private int numero;
    private String Concepto;
    private double importe;
    private String categoria;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getConcepto() {
        return Concepto;
    }

    public void setConcepto(String concepto) {
        Concepto = concepto;
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

    public Productos(int numero, String concepto, double importe, String categoria) {
        this.numero = numero;
        Concepto = concepto;
        this.importe = importe;
        this.categoria = categoria;
    }
}
