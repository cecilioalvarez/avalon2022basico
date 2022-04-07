package es.avalon.objetos.EjercicioRectangulo;

public class Resultado {
    public static void main(String[] args) {
        Rectangulo rec= new Rectangulo(25,10);

        System.out.println(rec.area());
        System.out.println(rec.perimetro());
    }

}
