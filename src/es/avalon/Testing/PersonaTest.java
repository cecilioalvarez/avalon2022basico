package es.avalon.Testing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class PersonaTest {

    @DisplayName("Test la Persona es mayor de edad")
    @Test
    public void  testMayorEdad(){
        Persona persona1= new Persona("12345678A","Campos", LocalDate.of(1987,8,22));
        assertTrue(persona1.isMayorEdad());

        Persona persona2= new Persona("00000000B","Raúl", LocalDate.of(2020,7,19));
        assertFalse(persona2.isMayorEdad());
    }
    @DisplayName("Test Busqueda Persona por Dni de ArrayList")
    @Test
    public void testGestorPersonaBusqueda(){

        GestorPersona gestor = new GestorPersona();
        Persona persona= gestor.buscarPersonaPorDni("1");
        assertNotNull(persona);
        Persona persona3= gestor.buscarPersonaPorDni("3");
        assertNotNull(persona3);
        Persona persona4= gestor.buscarPersonaPorDni("4");
        assertNotNull(persona4);
        Persona persona2= gestor.buscarPersonaPorDni("10");
        assertNull(persona2);
    }
    @DisplayName("Comprobar que persona es mayor")
    @Test
    public void testPersonaEsMayor(){
        Persona persona1= new Persona("1","David",LocalDate.of(1987,8,22));
        Persona persona2=new Persona("2","Raúl",LocalDate.of(2020,7,19));
        //compara la igualdad entre dos objetos
        assertEquals(persona1,Persona.esMayor(persona1,persona2));
    }
}
