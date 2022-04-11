package es.avalon.objeto.ejemplo14;

public class Principal {
    public static void main(String[] args){

        DiscoDuro d1= new DiscoDuro("samsung",2);
        Ordenador o= new Ordenador(d1);
        Nas minas= new Nas();
        minas.addDisco(new DiscoDuro("seagate",2));
        minas.addDisco(new DiscoDuro("seagate",2));
        minas.addDisco(new DiscoDuro("seagate",2));
        minas.addDisco(new DiscoDuro("seagate",2));
        minas.addDisco(new DiscoDuro("seagate",2));
        o.conectarNas(minas);
        System.out.println(o.capacidadDisco());
    }

}
