package es.avalon.objetos.ejercicio02Mejorado;

public class Principal {

    public static void main(String[] args) {
        LamparaTecho lampara = new LamparaTecho(4,50);

        System.out.println("El consumo total en Watios de la lampara es " + lampara.potenciaTotal());
    }

}
