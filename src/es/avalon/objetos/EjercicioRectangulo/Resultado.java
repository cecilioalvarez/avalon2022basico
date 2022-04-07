package es.avalon.objetos.EjercicioRectangulo;

public class Resultado {
    public static void main(String[] args) {
        Rectangulo rec= new Rectangulo(25,2.5);

        System.out.println(rec.area());
        System.out.println(rec.perimetro());
    }

}
