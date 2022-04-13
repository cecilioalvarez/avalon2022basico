package Colecciones.Ejemplo002;

public class Principal {
    public static void main(String[] args) {
        String cadena = new String("hola");
        String cadena2 = "hola2";
        String suma = cadena.concat(cadena2);
        System.out.println(suma);
        System.out.println(cadena.length());
        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena.charAt(i));
        }
        System.out.println(cadena.startsWith("ho"));
        System.out.println(cadena.endsWith("ho"));
        System.out.println(cadena.toUpperCase());

        String texto ="hola como estas";
        String[]lista = texto.split(" ");
        for (String h: lista){
            System.out.println(h);
        }
    }
}
