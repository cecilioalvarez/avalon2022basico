package es.avalon.objetos.Ejemplo13;

public class Principal {
    public static void main(String[] args) {
        Bombilla b=new Bombilla(true);

        System.out.println(" la bombilla esta encendida?"+b.isEncendida());

        b.apagar();
        System.out.println(" la bombilla esta encendida?"+b.isEncendida());


        b.encender();
        System.out.println(" la bombilla esta encendida?"+b.isEncendida());

        if(b.isEncendida()){
            System.out.println("la bombilla esta encendida");
        }else{ System.out.println("la bombilla esta apagada");}

        Lampara l=new Lampara();
        l.addBombilla(new Bombilla(true));
        l.addBombilla(new Bombilla(false));
        l.addBombilla(new Bombilla(true));
        l.addBombilla(new Bombilla(true));



        l.bombillasencendidas();
        l.getBombillas().get(1).encender();
        l.bombillasencendidas();

        Lampara l1=new Lampara(new Bombilla(false));
        System.out.println(l1.getBombilla().isEncendida());
        l1.getBombilla().encender();
        System.out.println(l1.getBombilla().isEncendida());



    }


}
