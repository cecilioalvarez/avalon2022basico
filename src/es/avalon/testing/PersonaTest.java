package es.avalon.testing;

import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import java.time.LocalDate;

import static org.testng.AssertJUnit.*;

public class PersonaTest {
    @DisplayName("la persona es mayor de edad")
    @Test
    public void testMayorEdad(){
        Persona p1= new Persona("123","edwin", LocalDate.of(1998,1,1));
        assertTrue(p1.esMayorDeEdad());

        Persona p2= new Persona("123","edwin", LocalDate.of(1998,1,1));
        assertTrue(p1.esMayorDeEdad());

    }
    @Test
    public void testGestorPersonaBusqueda(){
        GestorPersona gestor= new GestorPersona();
        Persona p= gestor.buscarPersonaPorDni("i");
        assertNotNull(p);
        Persona p2 =gestor.buscarPersonaPorDni("10");
        assertNull(p2);

    }
    @Test
    public  void testComparacionPersonas (){
        Persona p1 = new Persona("1","edwin",LocalDate.of(2000,10,10));
        Persona p2 = new Persona("2","pedro",LocalDate.of(2010,10,10));
        Persona pNueva = new Persona("3","stiven",LocalDate.of(1980,10,10));

       // assertEquals(p1,Persona.esMayor(p1,p2));
    }


}
