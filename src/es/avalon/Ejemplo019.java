package es.avalon;

public class Ejemplo019 {
    public static void main(String[] args) {
        int [] numeros=new int[] {2,5,7,9,10,1,2};
        System.out.println(aprobados(numeros));
        System.out.println(suspensos(numeros));
    }

    static int aprobados(int[] a){
        int naprobados=0;
        for (int i=0;i<a.length;i++){
            if(a[i]>=5){
                naprobados++;
            }
        }
        return naprobados;
    }static int suspensos(int[] a){
        int nsuspensos=0;
        for (int i=0;i<a.length;i++){
            if(a[i]<5){
                nsuspensos++;
            }
        }
        return nsuspensos;
    }

}
