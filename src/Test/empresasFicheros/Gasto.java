package Test.empresasFicheros;

import java.util.Objects;

public class Gasto {
    Double importe;

    public Gasto(Double importe) {
        this.importe = importe;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Gasto)) return false;
        Gasto gasto = (Gasto) o;
        return Objects.equals(getImporte(), gasto.getImporte());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getImporte());
    }
}
