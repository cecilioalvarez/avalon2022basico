package es.avalon.jdbc;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

public class _06PrincipalUsoAR {

    public static void main(String[] args) {

        //Simplificamos la forma de insertar datos en el programa mediante el uso de la clase creada ActiveRecord
        PersonaAR p = new PersonaAR("46", "Juan Luis", 30);

        //Usamos el metodo creado para insertar
        //p.insertar();


        System.out.println("Buscamos una persona con el metodo creado en PersonaAR: " + PersonaAR.buscarUno("1").getNombre());

        List<PersonaAR> personas = PersonaAR.buscarTodos();

        System.out.println("\n\nUsamos metodo BuscarTodos para imprimir listado de personas");
        for (PersonaAR personaAR : personas){
            System.out.println(personaAR.getNombre());
        }

        List<PersonaAR> personasJose = PersonaAR.buscarTodosPorNombre("Jose");

        System.out.println("\n\nUsamos metodo BuscarTodosPorNombre para imprimir listado de personas que se llamen igual");
        for (PersonaAR personaAR : personasJose){
            System.out.println(personaAR.getNombre());
        }


        System.out.println("\n\nModificamos un valor compra");
        CompraAR compraExample= new CompraAR(LocalDate.now(), "Ordenadores", 500, 2);
        //compra.insertar();
        //compra.borrar(3);
        compraExample.actualizar(4, 500);

        System.out.println("\n\nBuscamos una compra por numero");
        System.out.println(CompraAR.buscarUno(1).getConcepto());


        System.out.println("\n\nListado de conceptos compras");
        List<CompraAR> compras = CompraAR.buscarTodos();

        for (CompraAR compra : compras){
            System.out.println("Concepto: " + compra.getConcepto() + ", numero:" +compra.getNumero());
        }

    }
}
