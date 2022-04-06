package es.avalon;

public class ejemploArraysCadenas {
    public static void main(String[] args) {
        String[] lista = new String[]{"hola","adios","que","tal"};
        String tamaño = "";

        for(int i=0;i< lista.length;i++ ){
            if (tamaño.length()<lista[i].length()){
                tamaño=lista[i];
            }
        }
        System.out.println(tamaño);
    }
}
