package es.avalon.jdbc.ejercicio03ARCompras;

import es.avalon.jdbc.ejercicio02AR.PersonaAR;

public class PrincipalARbuscarUno {

    public static void main(String[] args) {


        CompraAr compras=CompraAr.buscarUno((3));
        System.out.println(compras.getConcepto()+"" +compras.getImporte()+"" +compras.getPersonas_dni()+"" +compras.getNumero());

    }



}
