package es.avalon.jdbc.ejercicio03ARCompras;

import es.avalon.jdbc.ejercicio02AR.PersonaAR;

import java.time.LocalDate;

public class PrincipalArInsertar {
    public static void main(String[] args) {
        CompraAr p = new CompraAr(11,"celular",200,LocalDate.now(),"2B");
        p.insertar();

    }

}
