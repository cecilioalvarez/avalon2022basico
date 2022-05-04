package es.avalon.jdbc;

import java.time.LocalDate;

public class PrincipalAR2 {
    public static void main(String[] args) {
        CompraAR compraAR= new CompraAR(LocalDate.now(),"Telefono",300,"1");
        compraAR.insertar();
    }
}
