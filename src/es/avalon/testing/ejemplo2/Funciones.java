package es.avalon.testing.ejemplo2;

public class Funciones {
    private double numero1;
    private double numero2;

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public Funciones() {
    }

    public double suma (int num1, int num2){
        return num1 + num2;
    }
    public double resta (int num1, int num2){
        return num1 - num2;
    }
    public double producto (int num1, int num2){
        return num1 * num2;
    }
    public int division (int num1, int num2){
        return num1 / num2;
    }
}

