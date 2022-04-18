package es.avalon.testing;


import org.junit.jupiter.api.Test;

        import static org.junit.jupiter.api.Assertions.assertEquals;
        import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectanguloTest {
    @Test
    //private double lado1;
    //private double lado2;

    public void areaTest() {

        Rectangulo r = new Rectangulo(2, 2);
        assertEquals(4, r.area());

    }

    @Test
    public void rectanguloCalculoAreaTest() {
        Rectangulo r = new Rectangulo(2, 2);
        assertEquals(8, r.perimetro());
    }

    @Test
    public void rectanguloCalculoAreaLadoCero() {
        Rectangulo r = new Rectangulo(0, 0);
        Rectangulo r1 = new Rectangulo(0, 1);
        Rectangulo r2 = new Rectangulo(2, 0);
        assertEquals(0, r.area());
        assertEquals(0, r1.area());
        assertEquals(0, r2.area());
    }

    @Test
    public void rectangulocalculoAreaExcepcionTest() {
        Rectangulo rectangulo = new Rectangulo(-1, 0);
        //Expresiones lambda
        Exception excepcion = assertThrows(Exception.class, () -> {
            rectangulo.area();
        });
    }
}
