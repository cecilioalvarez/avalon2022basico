package es.avalon.objetos.ejemplo16;

public class Principal {
    public static void main(String[] args) {

        Conductor c= new Conductor(new Kia());
        c.cambiarMarcha();
        c.setCoche(new Golf());
        c.cambiarMarcha();
    }
}
