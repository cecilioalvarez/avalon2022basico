package es.avalon.testing.ejemplo01Rectangulo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectanguloTest {


    //Anotacion es un simbolo que añade @ y un texto
    //Esta anotacion añade funcionalidad dinamica al metodo
    //De tal forma que el metodo pueda hacer cosas adicionales

    //Articulo de Cecilio sobre anotaciones
    //https://www.arquitecturajava.com/el-concepto-de-java-annotations/


    @Test
    public void rectanguloCalculoAreaTest(){

        Rectangulo r = new Rectangulo(2,2);

        //Mediante esta funcion le indicamos el resultado que debe dar un metodo de nuestra clase con los parametros enviados
        assertEquals(4,r.area());
    }

    //Prueba Unitaria de posibles casos que se pueden dar en las ejecuciones de los metodos

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


    @Test
    public void rectanguloCalculoAreaExcepcionTest(){

        Rectangulo r1 = new Rectangulo(-1,0);

        //Este codigo usa expresiones lambda
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
}
