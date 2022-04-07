package es.avalon.basico;

public class Ejemplo024Reves {
    public static void main(String[] args) {
        int[] numeros = new int[]{78, 57, 8, 98, 100, 8, 112};
        arrayinverso(numeros);

    }

    private static void arrayinverso(int[] numeros) {
        for (int i = numeros.length-1; i>=0; i--){
            System.out.println(numeros[i]);
        }
    }
}
