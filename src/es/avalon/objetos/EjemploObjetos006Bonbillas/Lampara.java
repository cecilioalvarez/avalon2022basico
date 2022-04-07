package es.avalon.objetos.EjemploObjetos006Bonbillas;

public class Lampara {
    private int[] bonbillas;

    public Lampara(int numeroBonbilla, int potenciaBonbilla){
        bonbillas = new int[numeroBonbilla];
        for (int i =0;i < bonbillas.length; i++){
            bonbillas[i] = potenciaBonbilla;
        }
    }

    public void setBonbillas(int posicion,int potencia){
        this.bonbillas[posicion]= potencia;
    }

    public int potenciaTotal(){
        int total =0;
        for (int i =0;i < bonbillas.length; i++){
            total += bonbillas[i];
        }
        return total;
    }
}
