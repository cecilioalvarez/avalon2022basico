package Objetos.Ejemplo019;

public abstract class Compra {


    private int Numero;
    private String concepto;
    private double coste;

    public Compra(int numero, String concepto, double coste) {
        Numero = numero;
        this.concepto = concepto;
        this.coste = coste;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    public abstract double getIvaImporte();
    public abstract double valor();
}
