package es.avalon.colecciones.Ejemplo001;

public class PrincipalCorazas {
    public static void main(String[] args) {
        int numero=7;
        Integer i=numero;//Esto es equivalente a =new Integer(numero)
        System.out.println(i+i);

        int otroNumero=Integer.parseInt("27");
        int otroNumero2=Integer.parseInt("90");
        System.out.println(otroNumero+otroNumero2);

        Integer n=77;
        System.out.println(n*2);
        String n1="32";
        String n2="3";
        System.out.println(n1+n2);
    }
}
