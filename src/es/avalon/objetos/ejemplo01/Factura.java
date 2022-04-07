package es.avalon.objetos.ejemplo01;

public class Factura {

    //Definicion de una clase a nivel general
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
        //Aumentamos la encapsulacion por que reduce lo que podemos hacer
        if(importe<100){
            this.importe = importe;
        }else{
            this.importe=100;
        }
    }

    //Metodo
    double importeConIVA() {
        return importe * 1.21;
    }
}
