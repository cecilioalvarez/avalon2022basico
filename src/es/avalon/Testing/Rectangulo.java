package es.avalon.Testing;

public class Rectangulo {

    private double Lado1;
    private double Lado2;

    public double getLado1() {
        return Lado1;
    }

    public void setLado1(double lado1) {
        this.Lado1 = lado1;
    }

    public double getLado2() {
        return Lado2;
    }

    public void setLado2(double lado2) {
        this.Lado2 = lado2;
    }

    public Rectangulo(double lado1, double lado2) {
        this.Lado1 = lado1;
        this.Lado2 = lado2;
    }

    public double area(){
        return getLado1()*getLado2();
    }

    public double perimetro(){
        return getLado1()*2+getLado2()*2;
    }

}
