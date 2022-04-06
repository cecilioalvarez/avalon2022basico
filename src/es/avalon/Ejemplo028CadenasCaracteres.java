package es.avalon;

public class Ejemplo028CadenasCaracteres {
    public static void main(String[] args) {
        String[] lista= new String[]{"hola","que","tal","estas","tu"};
        for (int i = 0;i< lista.length;i++){
            for (int j = 0;j< lista[i].length();j++){
                System.out.println(lista[i].charAt(j));
            }
        }
    }
}
