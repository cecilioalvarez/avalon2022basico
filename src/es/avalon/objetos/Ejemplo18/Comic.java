package es.avalon.objetos.Ejemplo18;

public class Comic extends Libro {

    private String color;

    public Comic(String autor, String color) {
        super(autor);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
