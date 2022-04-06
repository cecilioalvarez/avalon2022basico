package es.avalon;

public class ejemploCadenaDeCaracteres {

    public static void main(String[] args) {
        String[] lista = new String[]{"Hola","Que","Tal","Estas","Tu"};

        for(int x=0; x<lista.length;x++){
            for(int y=0; y<lista[x].length();y++){
                char caracter=lista[x].charAt(y);
                System.out.println(caracter);
            }

        }
    }
}
