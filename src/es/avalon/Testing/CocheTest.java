package es.avalon.Testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CocheTest {
    @Test

    public void CochePotenciaTest() {
        Coche c= new Coche("audi",new Motor(150));

        assertEquals(100,c.getPotencia(),1);

    }
}
