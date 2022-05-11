package es.avalon.jdbc.ejercicio03ARCompras;

import es.avalon.jdbc.ejercicio02AR.PersonaAR;

import java.util.List;

public class PrincipalARlistatodo {
    public static void main(String[] args) {
        List<CompraAr> lista= CompraAr.buscarTodos();
        for ( CompraAr compras:lista){
            System.out.println(compras.getConcepto()+"" +compras.getImporte()+"" +compras.getPersonas_dni()+"" +compras.getNumero());


        }

    }

}
