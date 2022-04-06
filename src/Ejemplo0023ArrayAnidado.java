public class Ejemplo0023ArrayAnidado {
    public static void main(String[] args) {
        int[] lista1 = new int[]{1,2,3};
        int[] lista2 = new int[]{4,5,6};
        int [][] listamax = new int [][]{lista1,lista2};

        for (int i = 0; i < listamax.length; i++) {
            for (int j = 0; j < lista2.length; j++) {
                System.out.print(listamax[i][j]+"   ");
            }
            System.out.println();
        }
    }
}
