package es.avalon.objetos.Ejemplo8;

public class Principal {
    public static void main(String[] args) {
        LamparaTecho lt=new LamparaTecho(5,50);
        System.out.println(lt.potenciaTotal());
        lt.setBombilla(1,100);
        System.out.println(lt.potenciaTotal());


        //int [] b=new int[] {30,40,50};
        LamparaTecho lt1=new LamparaTecho(new int[] {30,40,50});
        System.out.println(lt1.potenciaTotal());
        lt.mostrarLampara();
        System.out.println(lt.getBombillas());
        lt.getBombilla(0);
    }
}
