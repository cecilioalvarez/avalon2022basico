package es.avalon.testing.ejemplo04EmpresaGastos.test;

import es.avalon.testing.ejemplo04EmpresaGastos.LectorFichero;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LectorFicheroTest {

    @Test
    @DisplayName("leer lineas de fichero")
    public void leerLineasTest() {
        //Arrange preprar el codigo
        LectorFichero lector = new LectorFichero(new File("gastos.txt"));
        //Actuar ACT
        try {
            List<String> lineas = lector.leerLineas();
            //verificar Assert
            assertTrue(lineas.size() >= 1);
            assertTrue(lineas.get(0).contains("empresaA"));
            assertTrue(lineas.get(1).contains("empresaB"));
            assertTrue(lineas.get(2).contains("empresaC"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    @Test
    @DisplayName("leer lineas de fichero vacio")
    public void leerLineasFicheroLineasVaciasTest() throws FileNotFoundException {
        //arrange preprar el codigo
        LectorFichero lector = new LectorFichero(new File("gastosvacio.txt"));
        //actuar ACT

        List<String> lineas = lector.leerLineas();
        //verificar Assert
        assertTrue(lineas.size() == 0);

    }

    @Test
    @DisplayName("excepcion al no existir el fichero")
    public void noExisteFicheroTest() {
        //arrange preprar el codigo
        LectorFichero lector = new LectorFichero(new File("noexiste.txt"));

        Assertions.assertThrows(FileNotFoundException.class, () -> {
            lector.leerLineas();
        });


    }


}
