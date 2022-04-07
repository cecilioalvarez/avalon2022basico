package introduccion;

public class BucleFor {
    public static void main(String[] args) {

        int suma=0;

        for (int i=0;i<10;i++) {
            //acumulo valores en una variable suma
            suma=suma+i;
            System.out.println(i);
        }
        System.out.println(suma);
    }
}
