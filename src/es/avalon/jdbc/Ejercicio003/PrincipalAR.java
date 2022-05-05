package es.avalon.jdbc.Ejercicio003;

import java.util.List;

public class PrincipalAR {

    public static void main(String[] args) {

        RegaloAR.modificarConcepto(1,"boligrafo");
        RegaloAR.modificarConcepto(2,"lapiz");
        RegaloAR.modificarConcepto(3,"grapadora");
        RegaloAR.modificarConcepto(4,"lapiz");

        //System.out.println(RegaloAR.buscarRegalo(1).getConcepto());

        List<RegaloAR>regalos=RegaloAR.buscarTodosPorNombre("lapiz");
        for (RegaloAR r:regalos
             ) {
            System.out.println(r.getConcepto()+" "+r.getNumero());

        }
    }
}
