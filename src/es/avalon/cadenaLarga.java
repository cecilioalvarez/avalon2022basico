package es.avalon;

public class cadenaLarga {

    public static void main(String[] args){
        String[] lista = new String[]{"Hola", "Que", "Tal","Estas","tu","1123456"};
        //int tamano = 0;
        //int posc=0;
        String mayor = "";
        for (int i=0;i<lista.length;i++){
            //if (lista[i].length() >tamano){
             //   posc = i;
              //  tamano = lista[i].length();

            if (mayor.length()<lista[i].length()){
                mayor = lista[i];

            }
            }


        System.out.println("la palabra mas larga es: " + mayor);


        for (int i=0; i<lista.length;i++){
            for (int j=0; j<lista[i].length();j++) {
                char caracter = lista[i].charAt(j);
                System.out.println(caracter);
            }

        }
    }

    }

