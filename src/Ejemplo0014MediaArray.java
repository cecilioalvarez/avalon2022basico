public class Ejemplo0014MediaArray {
    public static void main(String[] args) {
        int [] lista = new int[] {7,10,5,1,3,2};
        double sum=0;

        for (int i = 0; i < lista.length; i++) {
            sum=sum+lista[i];
        }
        System.out.println(sum/ lista.length);
    }
}
