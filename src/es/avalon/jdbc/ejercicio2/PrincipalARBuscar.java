package es.avalon.jdbc.ejercicio2;

public class PrincipalARBuscar {
    public static void main(String[] args) {
        PersonaAR persona=PersonaAR.buscarUno("2");
        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());

    }
}
