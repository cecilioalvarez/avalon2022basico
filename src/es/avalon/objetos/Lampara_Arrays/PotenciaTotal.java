package es.avalon.objetos.Lampara_Arrays;

public class PotenciaTotal {
    public static void main(String[] args) {

        LamparaTecho lampara= new LamparaTecho(6,200);
        System.out.println(lampara.pTotal());

        lampara.setBombilla(6,120);
        System.out.println(lampara.pTotal());


    }
}
