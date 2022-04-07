package introduccion;

public class Ejemplo0020Repaso {
    public static void main(String[] args) {
        int[] numer = new int[]{2,5,7,9,8,1,2};
        int[] numer2 = new int[]{2,5,7,9,10,1,2};
        System.out.println(menor(numer,numer2));
    }
    static int menor(int[] uno, int [] dos){
        int menor=999999999;
        for (int i = 0; i < uno.length; i++) {
            if(menor>uno[i]){
                menor=uno[i];
            }
        }
        for (int i = 0; i < dos.length; i++) {
            if(menor>dos[i]){
                menor=dos[i];
            }
        }
        return menor;
    }

}
