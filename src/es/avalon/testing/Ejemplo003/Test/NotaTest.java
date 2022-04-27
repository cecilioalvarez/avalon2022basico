package es.avalon.testing.Ejemplo003.Test;

import es.avalon.testing.Ejemplo003.Nota;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NotaTest {


    @Test
    @DisplayName("comprobar que una nota esta aprovada")
    public void notaAprobadaTest(){
        //Arrange
        Nota nota=new Nota("Matematicas",7);
        Nota nota2=new Nota("Matematicas",5);

        //la parte de ACT
        boolean aprobada=nota.esAprovado();
        boolean aprobada2=nota2.esAprovado();

        //Assert
        assertTrue(aprobada);
        assertTrue(aprobada2);
    }
}
