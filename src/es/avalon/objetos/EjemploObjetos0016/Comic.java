package es.avalon.objetos.EjemploObjetos0016;

public class Comic {
    private String autor;
    private String editorial;
    private String color;

    //Constructor
    public Comic(String autor, String editorial, String color) {
        this.autor = autor;
        this.editorial = editorial;
        this.color = color;
    }

    //Getters and Setters
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
