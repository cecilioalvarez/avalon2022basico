package es.avalon.jdbc.ejercicio2;

import java.util.List;

public class PrincipalARLista {
    public static void main(String[] args) {
        List<PersonaAR> lista=PersonaAR.buscarTodos();
        for (PersonaAR p:lista){
            System.out.println(p.getNombre());
            System.out.println(p.getEdad());
        }
    }
}
