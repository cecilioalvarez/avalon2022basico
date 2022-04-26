package Test.empresasFicheros.Test;

import Test.empresasFicheros.LectorFichero;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LectorFicheroTest {

    @Test
    @DisplayName("leer lineas del fichero")
    void leerlineasTest() {
        LectorFichero lc = new LectorFichero(new File("gastos.txt"));
        try {
            List<String> lineas = lc.leerLineas();
            //assertEquals(3,lineas.size());
            assertTrue(lineas.size()>=3);
            //assertTrue(lineas.contains("empresa"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    @DisplayName("leer lineas del fichero Vacio")
    void leerlineasFucheroVacio() {
        LectorFichero lc = new LectorFichero(new File("gastos1.txt"));
        try {
            List<String> lineas = lc.leerLineas();
            //assertEquals(3,lineas.size());
            assertTrue(lineas.size()==0);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    @Test
    @DisplayName("fichero no EXISTE")
    public void ficheroNoExiste(){
        LectorFichero lc = new LectorFichero(new File("noExiste.txt"));
        Assertions.assertThrows(FileNotFoundException.class, ()->{
            lc.leerLineas();
        });
    }



}