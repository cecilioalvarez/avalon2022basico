package es.avalon.testing2;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private List<Gasto> gastos =new ArrayList<>();

    public String getNombre() {
        return nombre;
    }
    public void addGasto(Gasto gasto) {
        gastos.add(gasto);
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

}
