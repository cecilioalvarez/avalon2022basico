package es.avalon.testing.Ejemplo002.Test;

import es.avalon.testing.Ejemplo002.Empresa;
import es.avalon.testing.Ejemplo002.Gasto;
import es.avalon.testing.Ejemplo002.GestorGastoEmpresa;
import es.avalon.testing.Ejemplo002.LectorFichero;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GestorGastoEmpresaTest {

    @Test
    @DisplayName("Leer los datos de las empresas y sus gastos del fichero de texto")
    public void leerEmpresaGastosDeFichero() throws FileNotFoundException {

        //Genera dependencias entre los diferentes test
        LectorFichero lector = mock(LectorFichero.class);
        List<String> lineas = new ArrayList<>();
        lineas.add("empresaa, 100,200,400,600");
        lineas.add("empresab, 50,100,200,25");
        when(lector.leerLineas()).thenReturn(lineas);

        GestorGastoEmpresa gestor = new GestorGastoEmpresa(lector);
        List<Empresa> listaEmpresas = gestor.getEmpresaConGastos();


        assertTrue(listaEmpresas.contains(new Empresa("empresaa")));
        assertTrue(listaEmpresas.contains(new Empresa("empresab")));
        //assertTrue(listaEmpresas.contains(new Empresa("empresac")));
        Empresa empresaa=listaEmpresas.get(0);
        assertTrue(empresaa.getGastos().contains(new Gasto(100)));
        assertTrue(empresaa.getGastos().contains(new Gasto(200)));
        assertTrue(empresaa.getGastos().contains(new Gasto(400)));
        assertTrue(empresaa.getGastos().contains(new Gasto(600)));
    }
}
