package es.avalon.objetos.ejemplo06;

public class principal {
    public static void main(String[] args) {

        Rectangulo r1= new Rectangulo(2,3);
        System.out.println(r1.area());
        System.out.println(r1.perimetro());

        r1.setLado1(200);
        System.out.println(r1.perimetro());

    }}
