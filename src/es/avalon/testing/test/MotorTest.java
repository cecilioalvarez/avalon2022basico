package es.avalon.testing.test;

import es.avalon.testing.Motor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class MotorTest {

    @Test
    public void testMotor() {

        Motor m= new Motor(150);
        assertEquals(110,m.getPotencia(),1);

    }

}
