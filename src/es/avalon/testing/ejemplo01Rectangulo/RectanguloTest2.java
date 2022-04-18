package es.avalon.testing.ejemplo01Rectangulo;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectanguloTest2 {

    Rectangulo r1;
    Rectangulo r2;

    //Se suele tener este tipo de metodos de configuracion inicial donde para operaciones basicas inicializamos algunos objetos que usaremos
    //En los metodos mas basicos
    @BeforeEach //Antes de cada ejecucion o cada metodo
    public void setUp(){
        r1 = new Rectangulo(2,2);
        r2 = new Rectangulo(4,3);
    }

    @DisplayName("Test calculo Area del rectangulo")
    @Test
    public void rectanguloCalculoAreaTest(){

        assertEquals(4,r1.area());
    }



    @DisplayName("Test Area para valores de lados 0")
    @Test
    public void rectanguloCalculoAreaLadosCeroTest(){

        //En este caso si uno o varios de sus lados es 0
        Rectangulo r1 = new Rectangulo(0,0);
        Rectangulo r2 = new Rectangulo(0,2);
        Rectangulo r3 = new Rectangulo(2,0);


        assertEquals(0,r1.area());
        assertEquals(0,r2.area());
        assertEquals(0,r3.area());
    }


    @DisplayName("Test lanzamiento de excepcion calculo area negativo")
    @Test
    public void rectanguloCalculoAreaExcepcionTest(){

        Rectangulo r1 = new Rectangulo(-1,0);

        Exception exception = assertThrows(Exception.class, () -> {
            r1.area();
        });

    }

    @Test
    public void rectanguloCalculoPerimetroTest(){

        //Dentro de la funcion testing podemos realizar varias pruebas con distintos rectangulos
        Rectangulo r = new Rectangulo(2, 2);
        Rectangulo r2 = new Rectangulo(3, 2);

        assertEquals(8, r.perimetro());
        assertEquals(10, r2.perimetro());
    }


    //Se ejecuta cuando hayan terminado los test
    @AfterEach
    public void tearDown(){
        r1 = null;
        r2 = null;
    }
}
