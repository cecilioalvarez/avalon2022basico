package es.avalon.objetos.ejemplo05;

public class factura {
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
