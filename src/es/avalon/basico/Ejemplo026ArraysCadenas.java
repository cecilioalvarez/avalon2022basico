package es.avalon.basico;

public class Ejemplo026ArraysCadenas {
    public static void main(String[] args) {
        String [] lista=new String[]{"Hola","que","tal","estas"};
        String cadena= lista[0];
        String cadena1= lista[0];
        for (int i=0;i< lista.length;i++) {
            if (cadena.length() < lista[i].length()) {
                cadena = lista[i];

            }
        }
        System.out.println(cadena);



    }
}
