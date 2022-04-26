package es.avalon.testing2.test;

import es.avalon.testing2.Empresa;
import es.avalon.testing2.GestorGastoEmpresa;
import es.avalon.testing2.LectorFichero;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

import static org.testng.AssertJUnit.assertTrue;

public class GestorGastoEmpresaTest {

    @Test
    @DisplayName("leer los datos de las empreassa y sus gastos del fichero de texto")
    public  void LeerEmpresaGastosDeFichero() throws FileNotFoundException {
        GestorGastoEmpresa gestor = new GestorGastoEmpresa(new LectorFichero(new File("gastos.txt")));
        List<Empresa> listaEmpresas=gestor.getEmpresaConGastos();

        assertTrue(listaEmpresas.contains(new Empresa("empresaa")));
        assertTrue(listaEmpresas.contains(new Empresa("empresab")));
        assertTrue(listaEmpresas.contains(new Empresa("empresac")));




    }
}
