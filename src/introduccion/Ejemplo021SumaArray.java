package introduccion;

public class Ejemplo021SumaArray {
    public static void main(String[] args) {
        int[] numer = new int[]{2,5,7,9,8,1,2};
        int[] numer2 = new int[]{2,5,7,9,10,1,2};

        suma(numer,numer2);

    }

    static void suma(int[] numer, int [] numer2){
        int[] numer3 = new int[7];
        for (int i = 0; i < numer3.length; i++) {
            numer3[i]=numer[i]+numer2[i];
            System.out.println(numer3[i]);
        }
    }
}
