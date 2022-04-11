package es.avalon.objetos.Ejemplo16;

public class Principal {
    public static void main(String[] args) {
        Conductor c=new Conductor(new Kia());
        c.cambiarMarcha();
        c.girarCoche();
        c.setCoche(new Golf());
        c.girarCoche();
        c.cambiarMarcha();

        System.out.println("..............");
        Conductor c1=new Conductor(new Golf());
        c1.cambiarMarcha();
        c1.girarCoche();
        c1.setCoche(new Kia());
        c1.girarCoche();
        c1.cambiarMarcha();
    }
}
