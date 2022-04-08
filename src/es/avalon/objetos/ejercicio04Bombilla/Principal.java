package es.avalon.objetos.ejercicio04Bombilla;

public class Principal {

    public static void main(String[] args) {

        Bombilla bombilla = new Bombilla(true, 0);

        if (bombilla.isEncendida()){
            System.out.println("La bombilla esta encendida, pero la vamos a apagar");
            bombilla.off();
        }else{
            System.out.println("La bombilla esta apagada pero la vamos a encender");
            bombilla.on();
        }

        System.out.println("La bombilla ahora esta: " + bombilla.isEncendida());


        //Si lo delegamos a lampara seria
        System.out.println("\nDelegando la funcion a la lampara:\n");
        Lampara l = new Lampara(new Bombilla(1));

        if (l.getBombilla().isEncendida()){
            System.out.println("La bombilla esta encendida, pero la vamos a apagar");
            l.off();
        }else{
            System.out.println("La bombilla esta apagada pero la vamos a encender");
            l.on();
        }

        System.out.println("La bombilla ahora esta: " + l.getBombilla().isEncendida());

    }
}
