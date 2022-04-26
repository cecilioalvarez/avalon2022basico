package es.avalon.Testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MotorTest {

    @Test
    public void testMotor() {

        Motor m= new Motor(150);
        assertEquals(110,m.getPotencia(),1);

    }

    @Test
    public void testMotorGasolina() {

        Motor m= new Motor(150);
        assertEquals(219,m.gastoGasolina(),0.1);

    }
}
