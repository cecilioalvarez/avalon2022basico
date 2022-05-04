package es.avalon.jdbc;

import java.time.LocalDate;
import java.util.List;

public class MainCompraAR {
    public static void main(String[] args) {


        CompraAR c = new CompraAR(LocalDate.now(),"Consola", 600F,"1A");
        c.insertar();
        System.out.println("Registro Insertado");

        System.out.println("*******************************************************");

        CompraAR ca = new CompraAR(18,LocalDate.now(),"Smartphone",500F,"1A");
        ca.actualizar();
        System.out.println("Registro Actualizado");

        System.out.println("*******************************************************");



        CompraAR compra = CompraAR.buscarUno(18);
        System.out.println(compra.getConcepto() + " " + compra.getFecha() + " " + compra.getImporte() + " " + compra.getPersona_dni());

        System.out.println("*******************************************************");

        List<CompraAR> lista=CompraAR.buscarTodo();
        for(CompraAR p:lista){

            System.out.println(p.getConcepto() + " " + p.getFecha() + " " + p.getImporte() + " " + p.getPersona_dni());
        }


        System.out.println("*******************************************************");

        List<CompraAR> listaOrdenado = CompraAR.buscarOrdenado();
        System.out.println("Ordenado por Concepto");

        for(CompraAR p:listaOrdenado){

            System.out.println(p.getConcepto() + " " + p.getFecha() + " " + p.getImporte() + " " + p.getPersona_dni());
        }

        System.out.println("*******************************************************");

        List<CompraAR> listaOrdenadoFecha = CompraAR.buscarOrdenadoFecha();
        System.out.println("Ordenado por Fecha Descendente");

        for(CompraAR p:listaOrdenadoFecha){

            System.out.println(p.getFecha() + " " +p.getId()+ " " + p.getConcepto() + " " + p.getImporte());
        }

        /*System.out.println("*******************************************************");

        CompraAR cb = new CompraAR(17);
        cb.borrar();
        System.out.println("Registro Borrado");*/


    }





}
