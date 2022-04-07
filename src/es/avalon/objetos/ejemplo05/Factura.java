package es.avalon.objetos.ejemplo05;

public class Factura {
    // es una definicion de una clase a nivel general

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
        //igualame el concepto de la clase con el concepto que paso
        this.concepto = concepto;
        //igualame concepto consigomisma
        //concepto=concepto;
    }

    public double getImporte() {
        return importe;
    }
    //aumenta la encapsulacion
    public void setImporte(double importe) {
        if (importe<=100) {
            this.importe = importe;
        }else{
            this.importe=100;
        }
    }

    // metodo
    double importeConIVA() {
        //Estoy accediendo a la variable privada
        // y calculando un valor con ella
        return importe * 1.21;
    }
    double importeConIVA(int porcentaje) {
        //Estoy accediendo a la variable privada
        // y calculando un valor con ella
        return importe + importe*porcentaje/100;
    }

}
