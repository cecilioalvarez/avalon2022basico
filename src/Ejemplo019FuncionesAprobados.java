public class Ejemplo019FuncionesAprobados {
    public static void main(String[] args) {
        int[] numer = new int[]{2,5,7,9,10,1,2};
        System.out.println("aprobados: "+ aprobados(numer));
        System.out.println("No aprobados: "+ noAprobados(numer));
    }
    static double aprobados(int [] lista){
        double total=0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i]>=5){
                total++;
            }
        }
        return total;
    }

    static double noAprobados(int [] lista){
        double total=0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i]<5){
                total++;
            }
        }
        return total;
    }
}
