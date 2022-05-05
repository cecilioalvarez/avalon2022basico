package es.avalon.jdbc;

import java.time.LocalDate;

public class PrincipalAR2 {
    public static void main(String[] args) {
        CompraAR compraAR= new CompraAR(LocalDate.now(),"telefono",500,"100");
        compraAR.insertar();
    }
}