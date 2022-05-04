package es.avalon.testing.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class TestMotor {
    @Test
    public void testMotorPotencia(){
        Motor m=new Motor(150);
        assertEquals(110,m.getPotencia(),1);
    }

    @Test
    public void testMotorGasolina(){

        Motor m=new Motor(150);
        assertEquals(219,m.GastoGasolina(),0.1);
    }

}
