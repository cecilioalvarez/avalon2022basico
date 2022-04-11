package es.avalon.objetos.ejemplo18;

public class Libro extends Documento{
    private boolean Tapa;
    private int Capitulos;

    public boolean isTapa() {
        return Tapa;
    }

    public void setTapa(boolean tapa) {
        Tapa = tapa;
    }

    public int getCapitulos() {
        return Capitulos;
    }

    public void setCapitulos(int capitulos) {
        Capitulos = capitulos;
    }

    @Override
    public void setTitulo(String titulo) {
        super.setTitulo(titulo);
    }

    @Override
    public void setPaginas(int paginas) {
        super.setPaginas(paginas);
    }
}
