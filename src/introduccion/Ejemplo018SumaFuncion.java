package introduccion;

public class Ejemplo018SumaFuncion {
    public static void main(String[] args) {
        System.out.println(sumarnum(5));
    }
    static double sumarnum(int tope){
        int total=0;
        for (int i = 0; i < tope; i++) {
            total=total+i;
        }
        return total;
    }
}
