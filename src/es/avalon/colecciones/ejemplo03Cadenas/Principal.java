package es.avalon.colecciones.ejemplo03Cadenas;

public class Principal {

    public static void main(String[] args) {


        String cadena = new String("Hola");
        String cadena2 = "hola2";

        String sumaCadena = cadena.concat(cadena2);
        System.out.println(sumaCadena);

        System.out.println(cadena.length());

        for(int i=0; i<cadena.length();i++){
            System.out.println(cadena.charAt(i));
        }

        //Partir la cadena en cachos con un caracter de referencia de corte
        String texto = "hola,que,tal,estas";
        String[] lista = texto.split(",");
        for (String item:lista){
            System.out.println(item);
        }
    }
}
