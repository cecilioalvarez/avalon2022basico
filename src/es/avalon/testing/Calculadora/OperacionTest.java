package es.avalon.testing.Calculadora;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperacionTest {

    @DisplayName("Suma")
    @Test
    public void TestSuma(){
        assertEquals(Calculadora.sumar(4,8), 12);

    }

    @DisplayName("Resta")
    @Test
    public void TestResta(){
        assertEquals(Calculadora.restar(9,3), 6);


    }

    @DisplayName("Multiplicacion")
    @Test
    public void TestMultiplicar(){
        assertEquals(Calculadora.multiplicar(7,3), 21);


    }

    @DisplayName("Division")
    @Test
    public void TestDividir(){
        assertEquals(Calculadora.dividir(15,3), 5);


    }



}
