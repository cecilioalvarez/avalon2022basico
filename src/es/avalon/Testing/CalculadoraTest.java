package es.avalon.Testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    @Test
    public void TestCalculadoraSuma() {

        Calculadora calculadora= new Calculadora(2,2);
        assertEquals(4,calculadora.Suma());
    }
    @Test
    public void TestCalculadoraResta() {

        Calculadora calculadora= new Calculadora(2,2);
        assertEquals(0,calculadora.Resta());
    }
    @Test
    public void TestCalculadoraMult() {

        Calculadora calculadora= new Calculadora(5,2);
        assertEquals(10,calculadora.Mult());
    }
    @Test
    public void TestCalculadoraDiv() {

        Calculadora calculadora= new Calculadora(2,2);
        assertEquals(1,calculadora.Div());
    }
}
