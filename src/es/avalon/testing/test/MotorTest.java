package es.avalon.testing.test;


import es.avalon.testing.Motor;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

public class MotorTest {
    @Test
    public void testMotorPotencua(){
        Motor m =new Motor(150);
       assertEquals(110,m.getPotencia(),1);
    }
    public void testMotorGasolina(){
        Motor m =new Motor(150);
        assertEquals(219,m.gastoGasolina(),0.1);
    }
}
