package es.avalon.testing.ejemplo04EmpresaGastos.test;

import es.avalon.testing.ejemplo04EmpresaGastos.Empresa;
import es.avalon.testing.ejemplo04EmpresaGastos.Gasto;
import es.avalon.testing.ejemplo04EmpresaGastos.GestorGastoEmpresa;
import es.avalon.testing.ejemplo04EmpresaGastos.LectorFichero;
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

public class GestorGastoEmpresaTest {

    @Test
    @DisplayName("Leer los datos de las empresas y sus gastos del fichero de texto")
    public void leerEmpresaGastosDeFichero() throws FileNotFoundException {


        /********* ARRANGE (Preparar) *********/

        //Creamos un objeto mock o simulado
        LectorFichero lector = mock(LectorFichero.class);

        //Creamos un array list (Que es lo que recibiriamos)
        List<String> lineas = new ArrayList<>();

        //Añadimos las lineas que sabemos que contiene el archivo
        lineas.add("empresaA, 100, 200, 400, 600");
        lineas.add("empresaB, 50, 100, 200, 25");
        lineas.add("empresaC, 100, 200, 200, 100");

        //Cuando llamemos al metodo leerlineas, retornar la lista creada nuestra llamada lineas
        when(lector.leerLineas()).thenReturn(lineas);

        //Creamos una lista a partir de varios objetos separados por comas (gracias al metodo .asList)
        List<Gasto> gastos1 = Arrays.asList(new Gasto(100), new Gasto(200), new Gasto(400), new Gasto(600));
        List<Gasto> gastos2 = Arrays.asList(new Gasto(50), new Gasto(100), new Gasto(200), new Gasto(25));
        List<Gasto> gastos3 = Arrays.asList(new Gasto(100), new Gasto(200), new Gasto(200), new Gasto(100));
        GestorGastoEmpresa gestor = new GestorGastoEmpresa(lector);


        /********* ACT (Actuar) *********/


        //Ahora ya realizamos uso de la funcion que queremos testear mediante el gestor con el metodo .getEmpresasConGastos()
        List<Empresa> listaEmpresas = gestor.getEmpresasConGastos();

        //Creamos un objeto empresa a partir de la lista
        Empresa empresaA = listaEmpresas.get(0);
        Empresa empresaB = listaEmpresas.get(1);
        Empresa empresaC = listaEmpresas.get(2);



        /********* Assert (Confirmar) *********/

        //Test de que contiene las empresas del archivo
        assertTrue(listaEmpresas.contains(empresaA));
        assertTrue(listaEmpresas.contains(empresaB));
        assertTrue(listaEmpresas.contains(empresaC));

        //Con esa empresa realizamos test y comparamos el array de gastos
        assertArrayEquals(empresaA.getGastos().toArray(), gastos1.toArray());
        assertArrayEquals(empresaB.getGastos().toArray(), gastos2.toArray());
        assertArrayEquals(empresaC.getGastos().toArray(), gastos3.toArray());
    }
}
