package es.avalon.jdbc;

import java.time.LocalDate;
import java.util.List;

public class PrincipalAR {
    public static void main(String[] args) {
        CompraAR compraAR= new CompraAR(LocalDate.now(),"telefono",500,"100");
        compraAR.insertar();
    }


}
