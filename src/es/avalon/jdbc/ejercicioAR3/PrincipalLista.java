package es.avalon.jdbc.ejercicioAR3;

import java.util.List;

public class PrincipalLista {
    public static void main(String[] args) {
        List<Compras> lista=Compras.BuscarTodo();
        for (Compras c:lista) {
            System.out.println(c.getConcepto() + "" + c.getFecha() + "" + c.getImporte() + "" + c.getDniPersona());

        }
    }
}
