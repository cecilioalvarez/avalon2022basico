package es.avalon.testing.Test;

import es.avalon.testing.Coche;
import es.avalon.testing.Motor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CocheTest {

    @Test

    public void CochePotenciaTest() {

        // generan la simulacion
        Motor m=mock(Motor.class);
        when(m.getPotencia()).thenReturn(109.5);

        Coche c= new Coche("audi",m);

        assertEquals(100,c.getPotencia(),1);

    }
    @Test
    public void CocheGasolinaTest() {

        // generan la simulacion
        Motor m=mock(Motor.class);
        // yo que me conozco la implementacion real se que debes devolcer 219
        when(m.gastoGasolina()).thenReturn(219.0);

        Coche c= new Coche("audi",m);

        assertEquals(219,c.getGastoGasolina(),1);

    }

}
