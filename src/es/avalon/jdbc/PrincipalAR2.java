package es.avalon.jdbc;

import java.time.LocalDate;

public class PrincipalAR2 {
    public static void main(String[] args) {
        CompraAR compraAR= new CompraAR(10, LocalDate.now(),"telefono",500);
        compraAR.insertar();
    }
}
