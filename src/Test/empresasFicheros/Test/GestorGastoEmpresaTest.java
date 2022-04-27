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
        /********Arrange*******/

        List <String> lineas = new ArrayList<>();
        lineas.add("empresaa, 100.0,200,400,600");
        lineas.add("empresab, 50,100,200,25");

        LectorFichero lector = mock(LectorFichero.class);
        when(lector.leerLineas()).thenReturn(lineas);
        GestorGastoEmpresa gestor = new GestorGastoEmpresa(lector);

        List<Gasto> gastos = Arrays.asList(new Gasto(100.0),new Gasto(200.0),new Gasto(400.0),new Gasto(600.0));
        List<Gasto> gastos1 = Arrays.asList(new Gasto(50.0),new Gasto(100.0),new Gasto(200.0),new Gasto(25.0));




        /******ACT (actuar)*********/
        List<Empresa> listaEmpresas = gestor.getEmpresaConGastos();
        Empresa empresaA=listaEmpresas.get(0);
        Empresa empresaB=listaEmpresas.get(1);

        //GestorGastoEmpresa gestor = new GestorGastoEmpresa(new LectorFichero(new File("gastos.txt")));
       /********ASSERT (Validar, confirmar)******/
        assertTrue(listaEmpresas.contains(empresaA));
        assertTrue(listaEmpresas.contains(empresaB));
        assertTrue(empresaA.getGastos().contains(new Gasto(100.0)));
        assertTrue(empresaA.getGastos().contains(new Gasto(200.0)));
        assertArrayEquals(empresaA.getGastos().toArray(), gastos.toArray());
        assertArrayEquals(empresaB.getGastos().toArray(), gastos1.toArray());
    }
}