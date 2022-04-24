package es.avalon.APIsCore.Genericos.ejemplo2;

import java.util.Objects;

public class Galleta {
    private String sabor;

    public Galleta(String sabor) {
        this.sabor = sabor;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Galleta)) return false;
        Galleta galleta = (Galleta) o;
        return Objects.equals(sabor, galleta.sabor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sabor);
    }
}
