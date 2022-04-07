package es.avalon.objetos.ejemplo08;

public class Main {
    public static void main(String[] args) {
        LamparaTecho lt = new LamparaTecho(6,50);
        System.out.println(lt.potenciaTotal());
        lt.setBombillas(2,300);
    }
}
