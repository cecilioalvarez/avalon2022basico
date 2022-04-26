package es.avalon.testing.ejemplo03Coche;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MotorTest {

    @Test
    public void testMotor() {
        Motor m = new Motor(150);

        assertEquals(110, m.getPotencia(), 1);

    }
}
