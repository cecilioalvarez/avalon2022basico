package es.avalon;

public class Ejemplo026Caracteres {
    public static void main(String [] args){
        String[] lista = {"h","ol","a","como","estas"};


        for (int i =0; i< lista.length;i++){
            for (int j = 0; j<lista[i].length();j++ ){
                System.out.println(lista[i].charAt(j));
            }
        }

    }
}
