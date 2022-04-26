package es.avalon.Testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CocheTest {
    @Test

    public void CochePotenciaTest() {

        //genero simulacion

        Motor m=mock(Motor.class);
        when(m.getPotencia()).thenReturn(109.5);

        Coche c= new Coche("audi",new Motor(150));
        assertEquals(100,c.getPotencia(),1);



    }
    @Test
    public void CocheGasolinaTest() {

        //genero simulacion
        Motor m=mock(Motor.class);
        when(m.gastoGasolina().thenReturn(219.0));
        Coche c=new Coche("Audi", m);

        assertEquals(197.1,c.getGastogasolina(),1);




    }
}
