package es.avalon.testing.ejemplo2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class calculadoraTest {
    @Test
    public void calcularSuma (){
            Funciones funcion1 = new Funciones();
            assertEquals(4, funcion1.suma(2,2));
        }
    @Test
    public void calcularResta (){
        Funciones funcion1 = new Funciones();
        assertEquals(0, funcion1.resta(2,2));
    }
    @Test
    public void calcularProducto (){
        Funciones funcion1 = new Funciones();
        assertEquals(4, funcion1.producto(2,2));
    }
    @Test
    public void calcularDivision (){
        Funciones funcion1 = new Funciones();
        assertEquals(1, funcion1.division(2,2));
    }
}
