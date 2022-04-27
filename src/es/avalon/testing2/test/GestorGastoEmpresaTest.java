package es.avalon.testing2.test;

import es.avalon.testing2.Gasto;
import es.avalon.testing2.GestorGastoEmpresa;
import es.avalon.testing2.LectorFichero;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GestorGastoEmpresaTest {

    @Test
    @DisplayName("leer los datos de las empresas y sus gastos del fichero de texto")
    public void leerEmpresaGastosDeFichero() throws FileNotFoundException {


        //geera dependencias entre los diferentes Test
        LectorFichero lector=mock(LectorFichero.class);

        List<String> lineas= new ArrayList<>();
        lineas.add("empresaa, 100,200,400,600");
        lineas.add("empresab, 50,100,200,25");



        // la clase Arrays esta llena de metodo estaticos
        // que nos ayudan a generar listas de forma sencilla
        List<Gasto> gastos= Arrays.asList(new Gasto(100),new Gasto(200),new Gasto(400),new Gasto(600));

        when(lector.leerLineas()).thenReturn(lineas);

        GestorGastoEmpresa gestor = new GestorGastoEmpresa(lector);
        List<Empresa> listaEmpresas = gestor.getEmpresasConGastos();

        assertTrue(listaEmpresas.contains(new Empresa("empresaa")));
        assertTrue(listaEmpresas.contains(new Empresa("empresab")));

        Empresa empresaA=listaEmpresas.get(0);

        assertArrayEquals(empresaA.getGastos().toArray(),gastos.toArray());



    }
}