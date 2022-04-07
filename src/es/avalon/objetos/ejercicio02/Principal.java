package es.avalon.objetos.ejercicio02;

public class Principal {

    public static void main(String[] args) {
        LamparaTecho lampara = new LamparaTecho(1,3,4);

        System.out.println("El consumo total en Watios de la lampara es " + lampara.potenciaTotal());
    }

}
