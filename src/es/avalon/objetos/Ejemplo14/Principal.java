package es.avalon.objetos.Ejemplo14;

public class Principal {
    public static void main(String[] args) {
        Ordenador o1 = new Ordenador(new Nas());

        //Nas n1=new Nas();
        o1.getNas().addDisco(new DiscoDuro(500));
        o1.getNas().addDisco(new DiscoDuro(200));
        o1.getNas().addDisco(new DiscoDuro(500));
        o1.getNas().addDisco(new DiscoDuro(500));


        
        System.out.println(o1.getNas().tamañoNas());;
        System.out.println(o1.getNas().getDiscoDuros().get(0).getCapacidad());
        System.out.println(o1.getNas().getDiscoDuros().get(1).getCapacidad());
        System.out.println(o1.getNas().getDiscoDuros().get(2).getCapacidad());
        System.out.println(o1.getNas().getDiscoDuros().get(3).getCapacidad());





    }
}
