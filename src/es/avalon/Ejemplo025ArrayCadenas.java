package es.avalon;

public class Ejemplo025ArrayCadenas {
    public static void main(String [] args){
        String[] lista = {"Wilson","Andres","Mercedes","Cecilio","Erick"};
        String mayor = "";

        for (int i =0; i< lista.length;i++){
            if (mayor.length()<lista[i].length()){
                mayor=lista[i];
            }
        }
        System.out.println(mayor);
    }
}
