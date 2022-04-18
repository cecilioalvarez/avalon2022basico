package es.avalon.testing.Ejemplo001.Test;

import es.avalon.testing.Ejemplo001.Calculadora;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    double numero1;
    double numero2;
    Calculadora c=new Calculadora(numero1,numero2);
    @DisplayName("Comprobacion de la calculadora")
    @BeforeEach
    public  void setUp(){
        numero1=8;
        numero2=4;
        c=new Calculadora(numero1,numero2);

    }
    @Test
    public void testSuma(){
        assertEquals(12,c.suma());
    }
    @Test
    public void testResta(){
        assertEquals(4,c.resta());
    }
    @Test
    public void testProducto(){
        assertEquals(32,c.producto());
    }
    @Test
    public void testDivision(){
        assertEquals(2,c.division());
    }

}
