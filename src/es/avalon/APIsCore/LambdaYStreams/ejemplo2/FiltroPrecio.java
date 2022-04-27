package es.avalon.APIsCore.LambdaYStreams.ejemplo2;

public class FiltroPrecio implements Filtro{
    @Override
    public boolean test(Libro l) {
        return l.getPrecio()>15;
    }
}
