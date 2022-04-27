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
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GestorGastoEmpresaTest {

    @Test
    @DisplayName("Leer los datos de las empresas y sus gastos del fichero de texto")
    public void leerEmpresaGastosDeFichero() throws FileNotFoundException {
        //Arrange (Preparar), ACT (Actuar), assert (Confirmar)
        //Genera dependencias entre los diferentes test por eso hemos creado un mock
        /************ Arrange ***********/
        List<String> lineas = new ArrayList<>();
        lineas.add("empresaa, 100,200,400,600");
        lineas.add("empresab, 50,100,200,25");
        //la clase arrays esta llena de metodos estaticos que nos ayuda a generar listas de manera sencilla
        LectorFichero lector = mock(LectorFichero.class);
        when(lector.leerLineas()).thenReturn(lineas);

        List<Gasto> gastos1= Arrays.asList(new Gasto(100),new Gasto(200),new Gasto(400), new Gasto(600));
        List<Gasto> gastos2= Arrays.asList(new Gasto(50),new Gasto(100),new Gasto(200), new Gasto(25));
        GestorGastoEmpresa gestor = new GestorGastoEmpresa(lector);

        /*****************Act (actuar)****************/
        List<Empresa> listaEmpresas = gestor.getEmpresaConGastos();
        Empresa empresaa=listaEmpresas.get(0);
        Empresa empresab=listaEmpresas.get(1);

        /***************Assert (caonfirmar)***********/


        assertTrue(listaEmpresas.contains(empresaa));
        assertTrue(listaEmpresas.contains(empresab));
        //assertTrue(listaEmpresas.contains(new Empresa("empresac")));

        //Compara dos arrays. empresa.getGastos es una lista y con .toArray() lo pasamos a Array y lo mismo hacemos
        //con gastos que es otra lista y lo pasamos a Array
        assertArrayEquals(empresaa.getGastos().toArray(), gastos1.toArray());
        assertArrayEquals(empresab.getGastos().toArray(), gastos2.toArray());

        assertTrue(empresaa.getGastos().contains(new Gasto(100)));
        assertTrue(empresaa.getGastos().contains(new Gasto(200)));
        assertTrue(empresaa.getGastos().contains(new Gasto(400)));
        assertTrue(empresaa.getGastos().contains(new Gasto(600)));
    }
}
