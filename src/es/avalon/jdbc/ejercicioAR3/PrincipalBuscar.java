package es.avalon.jdbc.ejercicioAR3;

public class PrincipalBuscar {
    public static void main(String[] args) {
        Compras c=Compras.BuscarUno(2);
        System.out.println(c.getConcepto() + "" + c.getFecha() + "" + c.getImporte() + "" + c.getDniPersona());

    }
}
