package es.avalon.testing.Ejemplo002;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Empresa {

    private String nombre;
    private List<Gasto>gastos=new ArrayList<>();

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public void addGasto(Gasto gasto){
        gastos.add(gasto);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Empresa)) return false;
        Empresa empresa = (Empresa) o;
        return nombre.equals(empresa.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    public List<Gasto> getGastos() {
        return gastos;
    }

    public void setGastos(List<Gasto> gastos) {
        this.gastos = gastos;
    }
}
