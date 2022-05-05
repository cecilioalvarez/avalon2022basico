package es.avalon.jdbc.Ejercicio001;

import java.util.List;

public class PrincipalAR2 {

    public static void main(String[] args) {
        PersonaAR2 personaAR2=new PersonaAR2("78","belen","Dieguez");
        personaAR2.insertar();
        //personaAR2.actualizar();
        //personaAR2.borrar();
        List<PersonaAR2>lista=PersonaAR2.buscarTodos();
        for (PersonaAR2 p: lista
             ) {
            System.out.println(p.getNombre());

        }
    }
}
