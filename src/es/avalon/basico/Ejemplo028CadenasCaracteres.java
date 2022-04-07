package es.avalon.basico;

public class Ejemplo028CadenasCaracteres {
    public static void main(String[] args) {

        String[] lista= new String[] {"hola","que","tal","estas","tu"};


        for (int i=0;i<lista.length;i++) {

                for (int j=0;j<lista[i].length();j++) {
                    char caracter=lista[i].charAt(j);
                    System.out.println(caracter);
                }
        }
        imprimir10Holas();
    }

    public static void imprimir10Holas() {

        for(int i=0;i<10;i++) {

            System.out.println("hola");
        }
    }
}
