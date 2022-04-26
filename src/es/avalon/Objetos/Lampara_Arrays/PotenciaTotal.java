package es.avalon.Objetos.Lampara_Arrays;


public class PotenciaTotal {
    public static void main(String[] args) {

        LamparaTecho lampara= new LamparaTecho(Constantes.NBOM,Constantes.PBOM);
        System.out.println(lampara.pTotal());

        lampara.setBombilla(Constantes.NBOM,Constantes.PBOM);
        System.out.println(lampara.pTotal());


    }
}
