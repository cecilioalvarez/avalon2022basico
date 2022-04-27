package Test.empresasFicheros;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
    public void addGasto(Gasto gasto){
        gastos.add(gasto);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Empresa)) return false;
        Empresa empresa = (Empresa) o;
        return Objects.equals(getNombre(), empresa.getNombre());
    }

    public List<Gasto> getGastos() {
        return gastos;
    }

    public void setGastos(List<Gasto> gastos) {
        this.gastos = gastos;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre());
    }
}
