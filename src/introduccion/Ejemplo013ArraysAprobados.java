package introduccion;

public class Ejemplo013ArraysAprobados {
    public static void main(String[] args) {
        int [] lista = new int[] {7,10,2,1,3,2,8};
        int aprobados=0;
        for (int i = 0; i < lista.length; i++) {

            if(lista[i]>=7){
                System.out.println("estudiante aprobado con nota de: "+lista[i]);
                aprobados++;
            }else{
                System.out.println("estudiante no aprobado con nota de: "+lista[i]);
            }
        }
        System.out.println("total aprobados: "+aprobados);
    }
}
