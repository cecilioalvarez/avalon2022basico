package es.avalon.testing.ejemplo04EmpresaGastos;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class GestorGastoEmpresa {

    private LectorFichero lector;

    public GestorGastoEmpresa(LectorFichero lector) {
        this.lector = lector;
    }


    public List<Empresa> getEmpresasConGastos() throws FileNotFoundException {

        //Creamos una lista de lineas con el lector
        List<String> lineas = lector.leerLineas();

        //Creamos otra lista de empresas
        List<Empresa> empresas = new ArrayList<>();

        for(String linea : lineas) {

            //Por cada linea de texto
            String[] textos = linea.split(","); //Partimos la linea por la , y metemos los valores a un array de String
            Empresa e = new Empresa(textos[0]); //Damos el nombre de la empresa, que sera el primer texto de la cadena

            //Terminamos de recorrer el array para guardar los gastos de cada linea
            for(int i=1; i<textos.length; i++){
                Gasto g = new Gasto(Double.parseDouble(textos[i])); //Ahora los gastos los almacenamos en el objeto gasto

                //Añadimos los gastos a la empresa
                e.addGasto(g);
            }

            //Añadimos la empresa
            empresas.add(e);
        }

        return empresas;
    }

}
