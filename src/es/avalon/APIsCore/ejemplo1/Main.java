package es.avalon.APIsCore.ejemplo1;public class Main {
    public static void main(String[] args) {
        //numero
        int numero = 7;
        //Objeto de tipo Coraza
        Integer miEntero = new Integer(numero);

        String numeroCadena = miEntero.toString();

        System.out.println(numero);

        System.out.println(numeroCadena);

        String numero2= "14";
        String numero3= "25";

        System.out.println(numero2+numero3);

        int resultado = Integer.parseInt(numero2)+ Integer.parseInt(numero3);

        System.out.println(resultado);

        //Convertir clase coraza(Integer) en tipo básico(Int)
        int nuevoNumero = miEntero.intValue()+5;
        System.out.println(nuevoNumero);


    }
}
