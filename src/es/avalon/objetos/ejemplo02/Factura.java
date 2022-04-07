package es.avalon.objetos.ejemplo02;

public class Factura {
    //definicion de una clase a nivel general

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

    //metodo que no recibe parametro pero devuelve un valor
    double importeConIVA(){

        return importe*1.21;
    }
}
