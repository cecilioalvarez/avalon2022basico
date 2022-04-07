package es.avalon.objetos.Ejemplo8;

public class Principal {
    public static void main(String[] args) {
        LamparaTecho lt=new LamparaTecho(5,50);
        System.out.println(lt.potenciaTotal());
        lt.setBombilla(1,100);
        System.out.println(lt.potenciaTotal());
    }
}
