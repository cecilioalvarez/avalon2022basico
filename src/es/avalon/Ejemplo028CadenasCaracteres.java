package es.avalon;

public class Ejemplo028CadenasCaracteres {
    public static void main(String[] args) {
        String[] lista= new String[]{"hola","que","tal","estas","tu"};
        for (int i = 0;i< lista.length;i++){
            String palabra = lista[i];
            for (int j = 0;j< palabra.length();j++){
                char letra = palabra.charAt(j);
                System.out.println(letra);
            }
        }
    }
}
