package es.avalon.testing.Ejemplo001.Test;

import es.avalon.testing.Ejemplo001.Motor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MotorTest {

    @Test
    public void testMotor() {
        Motor m = new Motor(150);

        assertEquals(110, m.getPotencia(), 1);
    }
}
