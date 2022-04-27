package es.avalon.Testing2.Test;

import es.avalon.Testing2.Empresa;
import es.avalon.Testing2.Gasto;
import es.avalon.Testing2.GestorGastoEmpresa;
import es.avalon.Testing2.LectorFichero;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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

        LectorFichero lector=mock(LectorFichero.class);
        List<String> lineas= new ArrayList<>();
        lineas.add("empresaa, 100,200,400,600");
        lineas.add("empresab, 50,100,200,25");

        when(lector.leerlineas()).thenReturn(lineas);


        GestorGastoEmpresa gestor = new GestorGastoEmpresa(lector);
        List<Empresa> listaEmpresa= gestor.getEmpresaConGastos();

        assertTrue(listaEmpresa.contains(new Empresa("empresaa")));
        assertTrue(listaEmpresa.contains(new Empresa("empresab")));
        Empresa empresaA=listaEmpresa.get(0);
        assertTrue(empresaA.getGastos().contains(new Gasto(100)));
        assertTrue(empresaA.getGastos().contains(new Gasto(200)));
        assertTrue(empresaA.getGastos().contains(new Gasto(400)));
        assertTrue(empresaA.getGastos().contains(new Gasto(600)));
    }

}
