package es.avalon.jdbc.ejercicio02AR;

public class PrincipalARUpdate  {

    public static void main(String[] args) {
        PersonaAR p = new PersonaAR("45", "Juan", "blanco");
        p.setNombre("jose");
        p.setApellido("mendez");
        p.Update();
    }
}


