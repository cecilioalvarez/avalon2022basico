package es.avalon.testing.Test;

import es.avalon.testing.Persona;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class PersonaTest {

    @DisplayName("la persona es mayor de edad")
    @Test
    public void testMayorEdad() {

        Persona p1=
                new Persona("123","gomez", LocalDate.of(1970,10,10));
        assertTrue(p1.esMayorDeEdad());

        Persona p2=
                new Persona("123","gomez", LocalDate.of(2020,10,10));
        assertFalse(p2.esMayorDeEdad());
    }
      /* @Test
       public void testGestorPersonaBusqueda(){
        GestorPersona gestor= new GestorPersona();
        Persona p= gestor.buscarPersonaPorDni("1");
        assertNotNull(p);
        Persona p2= gestor.buscarPersonaPorDni("5");
        assertNotNull(p2);
       }*/

       @Test
    public void testComparacionPersona(){

           Persona p1= new Persona("1", "juan", LocalDate.of(2000, 10, 10));
           Persona p2= new Persona("2", "sofia", LocalDate.of(2010,11,11));
           Persona pNueva= new Persona("4","mercedes",LocalDate.of(1992,12,12));

           //compara la igualdad entre dos objetos
           assertEquals(p1,Persona.esMayor(p1,p2));
           //compara si el objeto es el mismo en memoria
           assertSame(p1,Persona.esMayor(p1,p2));

           /*assertEquals(pNueva,Persona.esMayor(p1,pNueva));
           // compara si el objeto es el mismo en memoria
           assertEquals(p1,pNueva);
           assertSame(p1,pNueva);*/



       }
   }
