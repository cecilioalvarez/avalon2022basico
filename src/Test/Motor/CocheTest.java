package Test.Motor;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CocheTest {

    @Test
    void getPotencia() {
       // Motor m =new Motor(150);

        Motor m = mock(Motor.class);
        when(m.getPotencia()).thenReturn(109.5);
        Coche coche = new Coche("audi", m);
        assertEquals(100,coche.getPotencia(),1);
    }

    @Test
    void cocheGasolinaTest(){
       // Motor m =  new Motor(150);
        Motor m = mock(Motor.class);
        when(m.getConsumoGasolina()).thenReturn(219.0);
        Coche coche = new Coche("audi", m);
        assertEquals(219,coche.getConsumoGasolina(),1);

    }
}