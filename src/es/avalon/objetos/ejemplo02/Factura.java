package es.avalon.objetos.ejemplo02;

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

}
