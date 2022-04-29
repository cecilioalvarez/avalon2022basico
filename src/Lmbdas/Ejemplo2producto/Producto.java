package Lmbdas.Ejemplo2producto;

public class Producto {
    private int numero;
    private String concepto;
    private int importe;
    private String categoria;

    public Producto(int numero, String concepto, int importe, String categoria) {
        this.numero = numero;
        this.concepto = concepto;
        this.importe = importe;
        this.categoria = categoria;
    }

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

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
