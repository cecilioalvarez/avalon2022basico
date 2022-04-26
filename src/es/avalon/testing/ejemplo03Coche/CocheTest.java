package es.avalon.testing.ejemplo03Coche;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CocheTest {

    @Test
    public void CochePotenciaTest() {

        //Genera un objeto ficticio
        Motor m=mock(Motor.class);

        //Rellena el objeto mock con una simulacion de valor
        when(m.getPotencia()).thenReturn(109.5); //Cuando llames a m.getPotencia me respondes (109.5)
        //System.out.println(m.getPotencia());


        Coche coche = new Coche("Audi", m);
        assertEquals(100, coche.getPotencia(),1);
    }

    @Test
    public void CocheGasolinaTest(){

        //Genearmos una simulacion
        Motor m = mock(Motor.class);
        when(m.gastoGasolina()).thenReturn(219.0);

        Coche c = new Coche("Audi", m);

        assertEquals(219, c.getGastoGasolina(), 1);
    }
}
