package es.avalon.colecciones.ejemplo4;

public class PrincipalCorazas {

    public static void main(String[] args){
        int numero=7;
        //un inboxing es una corversion automatica
        //de tipo basico a objeto complejo
        Integer i= numero;

        int otronumero=Integer.parseInt("27");
        int otronumero2=Integer.parseInt("21");
        System.out.println(otronumero+otronumero2);
    }
}
