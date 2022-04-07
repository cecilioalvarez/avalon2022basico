package es.avalon.objetos.EjemploObjetos005;

public class AreaRectangulo {
    private double area1;
    private double area2;

    public AreaRectangulo(double area1, double area2) {
        this.area1 = area1;
        this.area2 = area2;
    }

    public double getArea1() {
        return area1;
    }

    public void setArea1(double area1) {
        this.area1 = area1;
    }

    public double getArea2() {
        return area2;
    }

    public void setArea2(double area2) {
        this.area2 = area2;
    }

    //Metodos

    public double area(){
        return area1 + area2;
    }

    public double perimetro(){
        return area1*2 + area2*2;
    }
}
