package es.avalon;

public class Ejemplo020NumeroMayor {
    public static void main(String[] args) {

        int[] numeros= new int[] {2,5,7,9,8,1,2};
        int[] numeros2= new int[] {7,5,7,9,10,1,2};

        int mayor=0;

        for (int i=0;i<numeros.length;i++) {

            if (mayor<numeros[i]) {
                mayor=numeros[i];
            }
        }

        for (int i=0;i<numeros2.length;i++) {

            if (mayor<numeros2[i]) {
                mayor=numeros2[i];
            }
        }
        System.out.println(mayor);
    }
}
