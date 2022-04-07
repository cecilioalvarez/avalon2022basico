package es.avalon.basico;

public class Ejemplo014Media {
    public static void main(String[] args) {
        float media=0;
        int sumaTotal=0;
        int[] lista = new int[]{7,10,5,1,3,2};
        for(int i=0;i<lista.length;i++){
            sumaTotal= sumaTotal + lista[i];
        }
        media= sumaTotal/ lista.length;
        System.out.println(sumaTotal);
        System.out.println(media);
    }
}

