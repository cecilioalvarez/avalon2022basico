package es.avalon.basico;

public class ejemploCadenaDeCaracteres {

    public static void main(String[] args) {
        String[] lista = new String[]{"Hola","Que","Tal","Estas","Tu"};

        for(int x=0; x<lista.length;x++){
            for(int y=0; y<lista[x].length();y++){

                //El charAt() devuelve el carácter en el índice especificado de una cadena.
                char caracter=lista[x].charAt(y);
                System.out.println(caracter);
            }

        }
    }
}
