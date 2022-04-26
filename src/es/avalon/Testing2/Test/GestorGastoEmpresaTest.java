package es.avalon.Testing2.Test;

import es.avalon.Testing2.Empresa;
import es.avalon.Testing2.GestorGastoEmpresa;
import es.avalon.Testing2.LectorFichero;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GestorGastoEmpresaTest {

    @Test
    @DisplayName("Leer los datos de las empresas y sus gastos del fichero de texto")

    public void leerEmpresaGastosDeFichero() throws FileNotFoundException {
        GestorGastoEmpresa gestor= new GestorGastoEmpresa(new LectorFichero(new File("gastos.txt")));

        List<Empresa> listaEmpresa= gestor.getEmpresaConGastos();
        assertEquals(listaEmpresa.size(),3);
    }

}
