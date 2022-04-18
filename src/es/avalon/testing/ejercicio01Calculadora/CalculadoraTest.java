package es.avalon.testing.ejercicio01Calculadora;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @DisplayName("Suma")
    @Test
    public void testSumar(){
        assertEquals(Calculadora.sumar(2,2), 4);
    }

    @DisplayName("Resta")
    @Test
    public void testRestar(){
        assertEquals(Calculadora.restar(4,2), 2);
    }

    @DisplayName("Multiplicacion")
    @Test
    public void testMultiplicar(){
        assertEquals(Calculadora.producto(5,2), 10);
    }

    @DisplayName("Division")
    @Test
    public void testDividir(){
        assertEquals(Calculadora.division(10,2), 5);
        assertEquals(Calculadora.division(0,2), 2);
    }
}
