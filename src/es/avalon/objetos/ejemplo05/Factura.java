package es.avalon.objetos.ejemplo05;

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
    //Aumenta la encapsulación
    public void setImporte(double importe) {
        if (importe < 100) {
            this.importe = importe;
        }else {
            this.importe = 100;
        }
    }

    //metodo que no recibe parametro pero devuelve un valor
    double importeConIVA(){

        return importe*1.21;
    }
    double importeConIVA(int porcentaje){
        return importe + importe *porcentaje/100;
    }
}
