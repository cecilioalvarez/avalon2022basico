package es.avalon;

public class EjemploArraysCadenas {
    public static void main(String[] args){

        String[] lista= new String[]{"hola","que","tal","estas","tu"};
        String mayor="";
        for(int i=0;i<lista.length;i++){
            if (mayor.length()<lista[i].length()){
                mayor=lista[i];
            }
        }
        System.out.println(mayor);
    }
}
