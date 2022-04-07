package es.avalon.objetos.Ejemplo5;

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

    double importeConIVA(double iva) {//Aqui vemos una sobrecarga de metodos

        return importe + importe*(iva/100);
    }

    double importeConIVA() {

        return importe * 1.21;
    }

}
