package es.avalon.Colecciones.Ejemplo002;

public class Principal {
    public static void main(String[] args) {

        String cadena = new String("hola");
        String cadena2= "hola2";

        String sumaCadena=cadena.concat(cadena2);
        System.out.println(sumaCadena);

        System.out.println(cadena.length());

        for (int i=0;i<cadena.length();i++) {
            System.out.println(cadena.charAt(i));
        }

        System.out.println(cadena.startsWith("ho"));
        System.out.println(cadena.endsWith("ho"));
        System.out.println(cadena.toUpperCase());
        String texto="hola,que,tal,estas";
        String[] lista=texto.split(",");
        for (String item : lista) {

            System.out.println(item);
        }





    }
}
