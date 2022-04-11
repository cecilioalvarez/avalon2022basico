package es.avalon.objetos.ejemplo12Static;

public class Principal {

    public static void main(String[] args) {

        //Ejemplo de uso de una clase estatica, no generamos un objeto, si no que utilizamos las funciones de clase directamente
        double resultado = Matematicas.sumar(2,2);

        System.out.println(resultado);
    }
}
