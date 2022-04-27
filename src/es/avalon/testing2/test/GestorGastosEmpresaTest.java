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

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class GestorGastoEmpresaTest {

    @Test
    @DisplayName("leer los datos de las empresas y sus gastos del fichero de texto")
    public void leerEmpresaGastosDeFichero() throws FileNotFoundException {


        //geera dependencias entre los diferentes Test
        /******** Arrange ****************/
        List<String> lineas = new ArrayList<>();
        lineas.add("empresaa, 100,200,400,600");
        lineas.add("empresab, 50,100,200,25");
        LectorFichero lector = mock(LectorFichero.class);
        when(lector.leerLineas()).thenReturn(lineas);

        List<Gasto> gastos1 = Arrays.asList(new Gasto(100), new Gasto(200), new Gasto(400), new Gasto(600));
        List<Gasto> gastos2 = Arrays.asList(new Gasto(50), new Gasto(100), new Gasto(200), new Gasto(25));

        GestorGastoEmpresa gestor = new GestorGastoEmpresa(lector);



        /********* Act (actuar) ***********/
        List<Empresa> listaEmpresas = gestor.getEmpresasConGastos();
        Empresa empresaA = listaEmpresas.get(0);
        Empresa empresaB = listaEmpresas.get(1);


        /********** Assert (validar,confirmar) ***/
        assertTrue(listaEmpresas.contains(empresaA));
        assertTrue(listaEmpresas.contains(empresaB));
        assertArrayEquals(empresaA.getGastos().toArray(), gastos1.toArray());
        assertArrayEquals(empresaB.getGastos().toArray(), gastos2.toArray());


    }
}

