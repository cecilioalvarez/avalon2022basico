package Test.empresasFicheros.Test;

import Test.empresasFicheros.Empresa;
import Test.empresasFicheros.Gasto;
import Test.empresasFicheros.GestorGastoEmpresa;
import Test.empresasFicheros.LectorFichero;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class GestorGastoEmpresaTest {

    @Test
    void getEmpresaConGastos() throws FileNotFoundException {
        LectorFichero lector = mock(LectorFichero.class);
        List <String> lineas = new ArrayList<>();
        lineas.add("empresaa, 100.0,200,400,600");
        lineas.add("empresab, 50,100,200,25");
        when(lector.leerLineas()).thenReturn(lineas);
        GestorGastoEmpresa gestor = new GestorGastoEmpresa(lector);
        //GestorGastoEmpresa gestor = new GestorGastoEmpresa(new LectorFichero(new File("gastos.txt")));
        List<Empresa> listaEmpresas = gestor.getEmpresaConGastos();
        assertTrue(listaEmpresas.contains(new Empresa("empresaa")));
        assertTrue(listaEmpresas.contains(new Empresa("empresab")));
        //assertTrue(listaEmpresas.contains(new Empresa("empresac")));
        Empresa empresa=listaEmpresas.get(0);
        List<Gasto> gastos = Arrays.asList(new Gasto(100.0),new Gasto(200.0),new Gasto(400.0),new Gasto(600.0));

        assertTrue(empresa.getGastos().contains(new Gasto(100.0)));
        assertTrue(empresa.getGastos().contains(new Gasto(200.0)));
        assertArrayEquals(empresa.getGastos().toArray(new Gasto[0]), gastos.toArray());
    }
}