package es.avalon.testing2.test;

import es.avalon.testing2.Empresa;
import es.avalon.testing2.Gasto;
import es.avalon.testing2.GestorGastoEmpresa;
import es.avalon.testing2.LectorFichero;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class GestorGastoEmpresaTest {


    @Test
    @DisplayName("leer los datos de las empresas y sus gastos del fichero de texto")
    public void leerEmpresaGastosDeFichero() throws FileNotFoundException {


        //geera dependencias entre los diferentes Test
        LectorFichero lector=mock(LectorFichero.class);
        List<String> lineas= new ArrayList<>();
        lineas.add("empresaa, 100,200,400,600");
        lineas.add("empresab, 50,100,200,25");

        List<Gasto> gastos1= Arrays.asList(new Gasto(100),new Gasto(200),new Gasto(400),new Gasto(600));
        List<Gasto> gastos2= Arrays.asList(new Gasto(50),new Gasto(100),new Gasto(200),new Gasto(25));
        when(lector.leerLineas()).thenReturn(lineas);

        GestorGastoEmpresa gestor = new GestorGastoEmpresa(lector);
        List<Empresa> listaEmpresas = gestor.getEmpresasConGastos();

        /*assertTrue(listaEmpresas.contains(new Empresa("empresaa")));
        assertTrue(listaEmpresas.contains(new Empresa("empresab")));*/
        Empresa empresaA =listaEmpresas.get(0);
        Empresa empresaB =listaEmpresas.get(1);

      /*  assertTrue(empresaA.getGastos().contains(new Gasto(100)));
        assertTrue(empresaA.getGastos().contains(new Gasto(200)));
        assertTrue(empresaA.getGastos().contains(new Gasto(400)));
        assertTrue(empresaA.getGastos().contains(new Gasto(600)));*/
        assertTrue(listaEmpresas.contains(empresaA));
        assertTrue(listaEmpresas.contains(empresaA));

        assertArrayEquals(empresaA.getGastos().toArray(),gastos1.toArray());
        assertArrayEquals(empresaB.getGastos().toArray(),gastos2.toArray());

    }

}
