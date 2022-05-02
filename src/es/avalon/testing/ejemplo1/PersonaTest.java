package es.avalon.testing.ejemplo1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;



public class PersonaTest {
    @DisplayName("La persona es mayor de edad")
    @Test
    public void testMayorEdad(){

        Persona p1 = new Persona ("123", "Gomez", LocalDate.of(1970, 10, 10));
        assertTrue(p1.esMayorDeEdad());
        
        Persona p2 = new Persona ("123", "Raul", LocalDate.of(2020, 10, 10));
        assertTrue(p2.esMayorDeEdad());
    }
    @DisplayName( "Busqueda por DNI")
    @Test
    public void testGestorPersonaBusqueda () {
        GestorPersona gestor = new GestorPersona();
        Persona p = gestor.buscarPersonaPorDni("1");
        assertNotNull(p);
    }
    @DisplayName("Comprobar que persona es mayor")
    @Test
    public void testQuienEsMayor(){
        Persona p1 = new Persona ("123", "Gomez", LocalDate.of(1970, 10, 10));
        Persona p2 = new Persona ("123", "Raul", LocalDate.of(2020, 10, 10));

        Persona p3= Persona.esMayor(p1,p2);
        assertSame(p3,p1);

    }


}
