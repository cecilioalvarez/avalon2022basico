package es.avalon.excepciones.ejemplo3;

public class Principal {

    public static void main(String[] args) {

        GestorFechas gestor= new GestorFechas();
        System.out.println(gestor.sumaDias("10/01/2022","11/01/2022","12/01/2022"));

    }

}
