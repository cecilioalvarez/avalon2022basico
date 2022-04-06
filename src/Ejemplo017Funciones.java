public class Ejemplo017Funciones {
    public static void main(String[] args) {

        System.out.println(sumar(2,3));
        System.out.println(restar(7,8));
        System.out.println(producto(4,10));
        System.out.println(dividir(4,7));
    }
    static double  sumar(double a, double b){

        return a+b;
    }
    static double  restar(double a, double b){

        return a-b;
    }
    static double  producto(double a, double b){

        return a*b;
    }
    static double  dividir(double a, double b){

        return a/b;
    }
}
