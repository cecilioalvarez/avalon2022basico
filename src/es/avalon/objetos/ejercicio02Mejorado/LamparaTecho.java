package es.avalon.objetos.ejercicio02Mejorado;

public class LamparaTecho {

    //Para acercarnos mas a la realidad podemos plantear el ejercicio de la siguiente forma

    //No sabemos de cuantas bombillas puede ser la lampara, por lo que hacemos una propiedad que nos permita flexibilidad
    private int[] bombillas;


    //Declaramos en el constructor el numero de bombillas que contiene la lampara y la potencia de estas
    public LamparaTecho(int numeroBombillas, int potenciaBombilla) {
        bombillas = new int[numeroBombillas];
        for (int i = 0; i < bombillas.length; i++) {
            bombillas[i] = potenciaBombilla;
        }
    }

    public int[] getBombillas() {
        return bombillas;
    }

    public void setBombillas(int[] bombillas) {
        this.bombillas = bombillas;
    }

    //Metodo a medida para cambiar la bombilla
    //(Imaginar el caso en el que haya que sustituir una bombilla a la lampara y esta sea distinta a las demas)
    public void setBombilla(int posicion, int potencia){
        this.bombillas[posicion] = potencia;
    }

    public int potenciaTotal() {
        int total = 0;

        for (int i = 0; i < bombillas.length; i++) {
            total += bombillas[i];
        }
        return total;
    }
}
