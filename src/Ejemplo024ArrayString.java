public class Ejemplo024ArrayString {
    public static void main(String[] args) {
        String[] lista = new String[]{"hola","que","tal","estas","tu"};
        int pos=0;
        int tamaño=0;
        for (int i = 0; i < lista.length; i++) {
            if(lista[i].length()>tamaño){
                pos=i;
                tamaño= lista[i].length();
            }
        }
        System.out.println(lista[pos]+",  plabra mas larga con "+tamaño+" letras");

    }
}
