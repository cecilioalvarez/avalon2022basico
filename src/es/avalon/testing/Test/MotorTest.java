package es.avalon.testing.Test;

import es.avalon.testing.Motor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class MotorTest {

    @Test
    public void testMotorPotencia() {

        Motor m= new Motor(150);
        assertEquals(110,m.getPotencia(),1);

    }

    @Test
    public void testMotorGasolina() {

        Motor m= new Motor(150);
        assertEquals(219,m.gastoGasolina(),0.1);

    }
}
