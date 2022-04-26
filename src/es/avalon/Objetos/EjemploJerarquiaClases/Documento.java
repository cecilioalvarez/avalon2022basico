package es.avalon.Objetos.EjemploJerarquiaClases;

public abstract class Documento {

    private String titulo;
    private String paginas;
    private String autor;
    private String tapa;
    private String capitulos;
    private String editorial;
    private String color;
    private String asignatura;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPaginas() {
        return paginas;
    }

    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTapa() {
        return tapa;
    }

    public void setTapa(String tapa) {
        this.tapa = tapa;
    }

    public String getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(String capitulos) {
        this.capitulos = capitulos;
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

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public Documento(String titulo, String paginas, String autor, String tapa, String capitulos, String editorial, String color, String asignatura) {
        this.titulo = titulo;
        this.paginas = paginas;
        this.autor = autor;
        this.tapa = tapa;
        this.capitulos = capitulos;
        this.editorial = editorial;
        this.color = color;
        this.asignatura = asignatura;
    }
}
