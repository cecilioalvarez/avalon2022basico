package es.avalon.basico;

public class Ejemplo028CadenasCaracteres {
    public static void main(String[] args) {
        String[] lista = new String[]{"Hola", "que", "tal", "estas", "tu"};
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista[i].length(); j++) {
                char caracter = lista[i].charAt(j);
                System.out.println(caracter);
            }
        }
    }
}
