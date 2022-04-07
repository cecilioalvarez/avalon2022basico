package es.avalon.basico;

public class Ejemplo019ArrayNumeros {

    public static void main(String[] args) {
        int[] notas = new int[] {2, 5, 7, 9, 10, 1, 2};


        //Crear 2 funciones que una devuelva el numero de aprobados y otra de suspensos

        System.out.println(aprobados(notas));
        System.out.println(suspendidos(notas));
        System.out.println(notaMasAlta(notas));
    }

    static int aprobados(int[] notas){

        int cantidad = 0;

        for(int i=0; i<notas.length; i++){
            if(notas[i]>= 5){
                cantidad++;
            }
        }

        return cantidad;
    }

    static int suspendidos(int[] notas){

        int cantidad = 0;

        for(int i=0; i<notas.length; i++){
            if(notas[i]< 5){
                cantidad++;
            }
        }

        return cantidad;
    }

    static int notaMasAlta(int[] notas){

        int nota = 0;

        for(int i=0; i<notas.length; i++){
            if(notas[i]> nota){
                nota = notas[i];
            }
        }

        return nota;
    }
}
