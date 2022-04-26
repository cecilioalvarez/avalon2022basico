package es.avalon.Testing2;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class GestorGastoEmpresa {

    private LectorFichero lector;

    public GestorGastoEmpresa(LectorFichero lector) {
        this.lector = lector;
    }

    public List<Empresa> getEmpresaConGastos() throws FileNotFoundException {
        List<String> lineas = lector.leerlineas();
        List<Empresa> empresas = new ArrayList<>();

        for(String linea: lineas ){
            String[] textos=linea.split(",");
            Empresa e = new Empresa(textos[0]);
            for(int i=1; i<textos.length;i++){
                Gasto g = new Gasto(Double.parseDouble(textos[i]));
                e.addGasto(g);

            }
            empresas.add(e);
        }
        return empresas;
    }
}
