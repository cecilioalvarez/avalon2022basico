package es.avalon;

public class EjemploFunciones {
    public static void main(String[] args) {

        System.out.println(sum(2,3));
        System.out.println(res(7,14));
        System.out.println(mult(8,9));
        System.out.println(div(10,3));
    }

    static double sum(double a, double b){

        return a+b;
    }

    static double res(double a, double b){

        return a-b;
    }

    static double div(double a, double b){

        return a/b;
    }

    static double mult(double a, double b){

        return a*b;
    }
}
