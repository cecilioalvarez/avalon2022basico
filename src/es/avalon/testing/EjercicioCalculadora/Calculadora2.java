package es.avalon.testing.EjercicioCalculadora;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Calculadora2 {

    @DisplayName("Suma")
    @Test
    public void testSuma(){

        assertEquals(Calculadora.Sumar(6,8), 14);
    }
    @DisplayName("Resta")
    @Test
    public void testResta(){

        assertEquals(Calculadora.Restar(7,4), 3);

    }
    @DisplayName("Multiplicar")
    @Test
    public void testMultiplicar(){

        assertEquals(Calculadora.Multiplicar(7,4), 28);

    }
    @DisplayName("Dividir")
    @Test
    public void testDividir(){
        assertEquals(Calculadora.Dividir(4,4), 1);

    }

}
