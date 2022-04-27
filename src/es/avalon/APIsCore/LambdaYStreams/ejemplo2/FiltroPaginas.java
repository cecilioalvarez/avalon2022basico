package es.avalon.APIsCore.LambdaYStreams.ejemplo2;

public class FiltroPaginas implements Filtro{

    //Codigo Mejor estructurado o Filtro parametrizado
    private int maxPag = 400;
    private int minPag = 0;

    @Override
    public boolean test(Libro l) {
        return l.getPaginas()<maxPag && l.getPaginas()>minPag;
    }

    public FiltroPaginas(int maxPag, int minPag) {
        this.maxPag = maxPag;
        this.minPag = minPag;
    }
    public FiltroPaginas(){

    }
}
