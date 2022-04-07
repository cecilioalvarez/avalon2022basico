package es.avalon.objetos.Ejemplo2;

public class Factura {

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
        if(importe<=100) {
            this.importe = importe;
        }else {
            this.importe=100;
        }
    }

    double importeConIVA(double iva) {

        return importe * iva;
    }

    double importeConIVA() {

        return importe * 1.21;
    }

}
