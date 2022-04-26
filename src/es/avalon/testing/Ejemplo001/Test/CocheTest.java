package es.avalon.testing.Ejemplo001.Test;

import es.avalon.testing.Ejemplo001.Coche;
import es.avalon.testing.Ejemplo001.Motor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CocheTest {

    @Test

    public void CochePotenciaTest(){
        Coche c=new Coche("Audi",new Motor(150));
        assertEquals(100,c.getPotencia(),1);
    }
}
