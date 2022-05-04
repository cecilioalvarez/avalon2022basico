package es.avalon.testing.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestCoche {

    @Test
    public void TestCochePotencia(){

        //mock genera un objeto ficticio
        Motor m=mock(Motor.class);
        //150*0.73=109.
        //rellena el mock con una simulacion de valor
        when(m.getPotencia()).thenReturn(109.5);
        //System.out.println(m.getPotencia());

        Coche c=new Coche("audi",m);
        assertEquals(100,c.getPotencia(),1);
    }
    @Test
    public void TestCocheGasolina(){

        //mock genera un objeto ficticio
        Motor m=mock(Motor.class);
        when(m.GastoGasolina()).thenReturn(219.0);

        Coche c=new Coche("audi",m);

        assertEquals(219,c.getGastoGasolina(),1);
    }


}
