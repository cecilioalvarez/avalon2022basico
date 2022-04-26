package Test.empresasFicheros;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private List<Gasto> gastos = new ArrayList<>();

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
