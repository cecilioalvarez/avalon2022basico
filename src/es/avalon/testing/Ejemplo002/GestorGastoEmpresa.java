package es.avalon.testing.Ejemplo002;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class GestorGastoEmpresa {

    private LectorFichero lector;

    public GestorGastoEmpresa(LectorFichero lector) {
        this.lector = lector;
    }

    public List<Empresa> getEmpresaConGastos() throws FileNotFoundException {
        //Devuelve una empresa con todos sus gastos

        List<String> lineas=lector.leerLineas();
        List <Empresa>empresas=new ArrayList<>();
        for (String linea:lineas){
            //por cada linea de texto
            String[]textos=linea.split(",");
            Empresa e=new Empresa(textos[0]);
            //Empiezo el contador desde 1 para deshechar el nombre de la empresa y solo almacenar en el array el gasto
            for (int i = 1; i < textos.length; i++) {
                //Cojo el gasto de cada linea y lo convierto de String a Double
                Gasto g=new Gasto(Double.parseDouble(textos[i]));
                //y lo añado a Empresa e
                e.addGasto(g);

            }
            empresas.add(e);
        }
        //retorna un ArrayList de Empresa
        return empresas;

    }
}
