package es.avalon.objeto.ejemplo19;

public abstract class Compra {

    private int numero;
    private String concepto;
    private double importe;

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

    public Compra(int numero, String concepto, double importe) {
        this.numero = numero;
        this.concepto = concepto;
        this.importe = importe;
    }
    public abstract double getImporteConIVA();
}
