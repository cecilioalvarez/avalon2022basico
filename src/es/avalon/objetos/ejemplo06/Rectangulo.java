package es.avalon.objetos.ejemplo06;

public class Rectangulo {
    private double lado1;
    private double lado2;

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    public double area() {
        return getLado1()+getLado2();
    }
    public double perimetro() {
        return getLado1()*2+getLado2()*2;
    }
}
