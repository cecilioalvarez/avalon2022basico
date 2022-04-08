package es.avalon.objetos.Ejemplo8;

public class LamparaTecho {
    private int[] bombillas;//Variable de tipo array para la clase lampara

    //constructor de la clase con dos variables que no son de la clase
    //Variables declaradas: int numeroBombillas, int potenciabonbillas, array bombillas.
    public LamparaTecho(int numeroBombillas, int potenciabombilla) {
        bombillas = new int[numeroBombillas];
        for (int i = 0; i < bombillas.length; i++) {
            bombillas[i] = potenciabombilla;
        }


    }
    //Constructor con variable que si es da la clase
    public LamparaTecho(int[] bombillas) {
        this.bombillas = bombillas;
    }

    public void setBombilla(int posicion, int potencia) {
        this.bombillas[posicion - 1] = potencia;
    }

    public int[] getBombillas() {
        return bombillas;
    }

    public void setBombillas(int[] bombillas) {
        this.bombillas = bombillas;
    }

    public int potenciaTotal() {
        int total = 0;
        for (int i = 0; i < bombillas.length; i++) {
            total += bombillas[i];
        }
        return total;
    }
    public void mostrarLampara (){
        for (int i=0;i< bombillas.length;i++){
            System.out.println(bombillas[i]);
        }
    }
    public void getBombilla(int posicion){
        System.out.println(this.bombillas[posicion]);

    }

}

