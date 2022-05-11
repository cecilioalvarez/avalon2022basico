package es.avalon.jdbc.ejercicio02AR;

public class PrincipalARBuscar {

    public static void main(String[] args) {


    PersonaAR personas=PersonaAR.buscaruno(("200259"));
    System.out.println(personas.getNombre());
    System.out.println(personas.getApellido());
    }


}
