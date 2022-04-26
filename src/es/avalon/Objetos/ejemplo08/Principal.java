package es.avalon.Objetos.ejemplo08;

public class Principal {
    public static void main(String[] args) {
        LamparaTecho lt= new LamparaTecho(4,50);
        System.out.println(lt.potenciaTotal());
        lt.setBombilla(2,300);
        System.out.println(lt.potenciaTotal());

    }
}
