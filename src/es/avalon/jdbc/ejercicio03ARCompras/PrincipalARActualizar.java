package es.avalon.jdbc.ejercicio03ARCompras;

import es.avalon.jdbc.ejercicio02AR.PersonaAR;

import java.nio.file.LinkOption;
import java.time.LocalDate;

public class PrincipalARActualizar {


    public static void main(String[] args) {
        CompraAr p = new CompraAr(4,"maquina",900, LocalDate.now(),"2B");
        p.Update();
    }
}
