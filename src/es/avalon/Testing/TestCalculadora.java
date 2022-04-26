package es.avalon.Testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalculadora {

    @Test
    public void testSuma(){
        Calculadora o1 = new Calculadora(10, 5);
        assertEquals(15,o1.suma());
    }
    @Test
    public void testResta(){
        Calculadora o1 = new Calculadora(10, 5);


    }
}
