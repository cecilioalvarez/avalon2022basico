package Objetos.Ejemplo008;

public class Principal {
    public static void main(String[] args) {
        LamparaTecho l = new LamparaTecho(10,15);
        System.out.println(l.potenciaTotal());
        l.change(5,325);
        System.out.println(l.potenciaTotal());
    }
    }


