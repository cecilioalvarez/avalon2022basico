package es.avalon;

public class Ejemplo013ArraysAprobados {public static void main(String[] args) {

    int [] lista= new int []{ 7,10,2,1,3,2};
    // hay que recorrer el array y tener una variable contador que cuenta los
    //aprobados
    int aprobados=0;
    for (int i=0;i<lista.length;i++) {

        if (lista[i]>=5) {
            // System.out.println(lista[i]);
            aprobados++;
        }

    }
    System.out.println(aprobados);

}
}


