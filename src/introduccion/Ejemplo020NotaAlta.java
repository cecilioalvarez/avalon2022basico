package introduccion;

public class Ejemplo020NotaAlta {

    public static void main(String[] args) {
        int[] numer = new int[]{2,5,7,9,10,1,2};
        System.out.println("Nota Alta: "+ nota(numer));

    }
    static double nota(int [] lista){
        double valor=0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i]>valor){
                valor=lista[i];
            }
        }
        return valor;
    }

}
