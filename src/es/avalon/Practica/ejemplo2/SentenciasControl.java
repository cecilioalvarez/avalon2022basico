package es.avalon.Practica.ejemplo2;

public class SentenciasControl {
    public static void main(String[] args) {
        int numero=5;
        if (numero>=5){
            System.out.println("Has aprobado");

        }else if (numero==5){
            System.out.println("Has aprobado muy justo");
        }
        else{
            if (numero<2){
                System.out.println("Has suspendido de forma exagerada");
            }
        }

    }
}
