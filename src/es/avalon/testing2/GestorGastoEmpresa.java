package es.avalon.testing2;

import java.util.ArrayList;
import java.util.List;

public class GestorGastoEmpresa {

    private LectorFichero lector;

    public GestorGastoEmpresa(LectorFichero lector) {
        this.lector = lector;
    }

    public List<Empresa> getEmpresaConGastos(){
        List<String> lineas= lector.leerLineas();
        List<Empresa> empresas= new ArrayList<>();


        for (String linea : lineas){
            String[] textos = linea.split(",");
            Empresa e = new Empresa(textos[0]);
            for (int i =0; i<textos.length;i++){
                Gasto g = new Gasto(Double.parseDouble(textos[i]));
                e.addGasto(g);
            }
            empresas.add(e);

        }
        return empresas;
    }
}
