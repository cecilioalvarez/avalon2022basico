package es.avalon.objetos.ejemplo05;

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
        this.importe = importe;
    }

    // metodo
    double importeConIVA() {
        //Estoy accediendo a la variable privada
        // y calculando un valor con ella
        return importe * 1.21;

    }
    double importeConIVA( int porcentaje) {
        //Estoy accediendo a la variable privada
        // y calculando un valor con ella
        return importe +importe*porcentaje/100;

    }

}
