package es.avalon;

public class EjemploArraysAprobados {

    public static void main(String[] args) {

        int [] lista= new int[]{1,3,6,2,5,8,10,6,4,2,6,8,5,3};

                int aprobado=0;
                int suspenso=0;

        for (int i=0;i<lista.length;i++) {
            if (lista[i]>=5){
                aprobado++;
            }else suspenso++;

           }
            System.out.println(aprobado);
            System.out.println(suspenso);


    }
}
