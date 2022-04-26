package es.avalon.testing.ejemplo04EmpresaGastos.test;

import es.avalon.testing.ejemplo04EmpresaGastos.Empresa;
import es.avalon.testing.ejemplo04EmpresaGastos.GestorGastoEmpresa;
import es.avalon.testing.ejemplo04EmpresaGastos.LectorFichero;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GestorGastoEmpresaTest {

    @Test
    @DisplayName("Leer los datos de las empresas y sus gastos del fichero de texto")
    public void leerEmpresaGastosDeFichero() throws FileNotFoundException {

        GestorGastoEmpresa gestor = new GestorGastoEmpresa(new LectorFichero(new File("gastos.txt")));

        List<Empresa> listaEmpresas = gestor.getEmpresasConGastos();

        assertEquals( 3, listaEmpresas.size());

        assertTrue(listaEmpresas.contains(new Empresa("empresaA")));
        assertTrue(listaEmpresas.contains(new Empresa("empresaB")));
        assertTrue(listaEmpresas.contains(new Empresa("empresaC")));

    }
}
