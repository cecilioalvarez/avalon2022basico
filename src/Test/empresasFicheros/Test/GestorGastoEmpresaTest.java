package Test.empresasFicheros.Test;

import Test.empresasFicheros.Empresa;
import Test.empresasFicheros.GestorGastoEmpresa;
import Test.empresasFicheros.LectorFichero;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GestorGastoEmpresaTest {

    @Test
    void getEmpresaConGastos() throws FileNotFoundException {
    GestorGastoEmpresa gestor = new GestorGastoEmpresa(new LectorFichero(new File("gastos.txt")));
        List<Empresa> listaEmpresas = gestor.getEmpresaConGastos();
        assertTrue(listaEmpresas.contains(new Empresa("empresaa")));
        assertTrue(listaEmpresas.contains(new Empresa("empresab")));
        assertTrue(listaEmpresas.contains(new Empresa("empresac")));
    }
}