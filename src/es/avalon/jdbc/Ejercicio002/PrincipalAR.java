package es.avalon.jdbc.Ejercicio002;

import es.avalon.jdbc.PersonaAR;

import java.time.LocalDate;
import java.util.List;

public class PrincipalAR {

    public static void main(String[] args) {
        //CompraAR compraAR= new CompraAR(LocalDate.now(),"telefono",500,"1A");
        //compraAR.insertar();
        //compraAR.borrar();
        CompraAR.todosLasCompras();
        System.out.println("...............");
        List<CompraAR>lista=CompraAR.buscarTodos();
        for (CompraAR c:lista
             ) {
            System.out.println(c.getConcepto());

        }
        System.out.println(".....................");
        System.out.println(CompraAR.buscarUno(1).getConcepto());
    }
}
