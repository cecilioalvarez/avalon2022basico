package es.avalon.Testing2;

import java.util.Objects;

public class Gasto {

    private double importe;

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Gasto(double importe) {
        this.importe = importe;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Gasto)) return false;
        Gasto gasto = (Gasto) o;
        return Double.compare(gasto.importe, importe) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(importe);
    }
}
