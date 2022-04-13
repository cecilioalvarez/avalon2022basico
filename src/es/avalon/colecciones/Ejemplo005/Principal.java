package es.avalon.colecciones.Ejemplo005;

public class Principal {

    public static void main(String[] args) {

        String cadena= new String ("Hola");
        String cadena2="Hola2";

        String sumaCadena=cadena.concat(cadena2);
        System.out.println(sumaCadena);

        System.out.println(cadena.length());

        for (int i=0;i<cadena.length();i++){
            System.out.println(cadena.charAt(i));
        }

        try {
            System.out.println(cadena.charAt(5));
        } catch (Exception e) {
            System.out.println("Fallo");
            //e.printStackTrace();
        }
        System.out.println(cadena.startsWith("H"));
        System.out.println(cadena.endsWith("g"));
        System.out.println(cadena.toUpperCase());

        String texto="hola,que,tal,estas";
        String [] lista=texto.split(",");
        for (String item: lista){
            System.out.println(item);
        }

    }
}
