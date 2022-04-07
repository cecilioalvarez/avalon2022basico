package es.avalon.basico;

public class Ejemplo020 {
    public static void main(String[] args){

        int [] numeros= new int[]{2,5,7,9,8,1,2};
        int [] numeros2= new int[]{2,5,7,9,8,1,2};
        int menor= numeros[0];
        for (int i=0;i< numeros.length;i++){
            if (menor>numeros[i]){
                menor=numeros[i];
            }
        }
        for (int i=0;i< numeros.length;i++){
            if (menor>numeros2[i]){
                menor=numeros2[i];
            }
        }
        System.out.println(menor);


    }
}
