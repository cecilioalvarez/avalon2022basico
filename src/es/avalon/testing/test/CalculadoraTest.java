package es.avalon.testing.test;

import es.avalon.testing.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    @Test
    public void sumaTest() {

        assertEquals (4,Calculadora.suma(2,2));
    }

    @Test
    public void restaTest() {

        assertEquals (0,Calculadora.resta(2,2));
    }
}
