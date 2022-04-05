package es.avalon;

public class Ejemplo013ArraysAprobados {
    public static void main(String[] args) {
        int[] lista = new int[]{7, 10, 2, 1, 3, 2};
        int aprobados = 0;

        for (int i = 0; i < lista.length; i++) {
            //Bucle for para recorrer la lista
            if (lista[i] >= 5) {
                aprobados++;
            //Comparamos si el numero es mayor o igual a 5 y si es asi lo incluimos al acumuladir
            }
        }
        System.out.println("Hay " + aprobados + " aprobados");

    }
}
