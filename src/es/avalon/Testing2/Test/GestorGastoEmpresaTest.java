package es.avalon.Testing2.Test;

import es.avalon.Testing2.Empresa;
import es.avalon.Testing2.Gasto;
import es.avalon.Testing2.GestorGastoEmpresa;
import es.avalon.Testing2.LectorFichero;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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

        LectorFichero lector=mock(LectorFichero.class);
        List<String> lineas= new ArrayList<>();
        lineas.add("empresaa, 100,200,400,600");
        lineas.add("empresab, 50,100,200,25");

        List<Gasto> gastos1 = Arrays.asList(new Gasto(100),new Gasto(200), new Gasto(400), new Gasto(600));
        List<Gasto> gastos2 = Arrays.asList(new Gasto(50),new Gasto(100), new Gasto(200), new Gasto(25));

        when(lector.leerlineas()).thenReturn(lineas);


        GestorGastoEmpresa gestor = new GestorGastoEmpresa(lector);
        List<Empresa> listaEmpresa= gestor.getEmpresaConGastos();

        Empresa empresaA = listaEmpresa.get(0);
        Empresa empresaB = listaEmpresa.get(1);

        assertTrue(listaEmpresa.contains(empresaA));
        assertTrue(listaEmpresa.contains(empresaB));

        assertArrayEquals(empresaA.getGastos().toArray(),gastos1.toArray());
        assertArrayEquals(empresaB.getGastos().toArray(),gastos2.toArray());
    }

}
