package es.avalon.testing2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Empresa)) return false;
        Empresa empresa = (Empresa) o;
        return Objects.equals(nombre, empresa.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
