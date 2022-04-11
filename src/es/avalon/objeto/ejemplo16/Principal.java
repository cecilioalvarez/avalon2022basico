package es.avalon.objeto.ejemplo16;

public class Principal {
    public static void main(String[] arg){

        Coductor c=new Coductor(new Kia());
        c.cambiarMarcha();
        c.setCoche(new Golf());
        c.cambiarMarcha();

    }
}
