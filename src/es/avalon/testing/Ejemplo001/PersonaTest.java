package es.avalon.testing.Ejemplo001;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Period;

import static org.junit.jupiter.api.Assertions.*;

public class PersonaTest {

    @DisplayName("la persona es mayor de edad")
    @Test
    public void testMayorDeEdad(){
        Persona p1=new Persona("11122244","Jose", LocalDate.of(1980,3,14));
        System.out.println(p1.esMayorDeEdad());
        assertTrue(p1.esMayorDeEdad());
        Period periodo= Period.between(p1.getFechadenacimiento(),LocalDate.now());
        System.out.println(periodo.getYears());
        System.out.println(periodo.getDays());
    }
    @Test
    public void testGestorPersonaBusqueda() {
        GestorPersona gestor=new GestorPersona();
        Persona p = gestor.buscarPersonaPorDni("1");
        assertNotNull(p);
        Persona p2=gestor.buscarPersonaPorDni("10");
        assertNull(p2);
    }
    @Test
    public  void testQuePersonaEsMayor(){
        Persona persona1=new Persona("1","Jose",LocalDate.of(1980,3,14));
        Persona persona2=new Persona("1","Lucia",LocalDate.of(1981,9,9));
        assertEquals(persona2,Persona.esMayor(persona1,persona2));
        System.out.println(Persona.esMayor(persona1,persona2).getNombre());

    }

}
