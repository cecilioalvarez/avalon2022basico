package es.avalon.Basico;

public class Ejemplo13arrayaprobados {

        public static void main(String[] args) {
            int[] lista = new int[]{7, 10, 2, 1, 3, 2};
            int aprobados = 0;
            for (int i = 0; i < lista.length; i++) {
                if (lista[i] >= 5) {
                    aprobados++;
                    //System.out.println(lista [i]);

                }
                System.out.println(aprobados);



            }
        }
    }
