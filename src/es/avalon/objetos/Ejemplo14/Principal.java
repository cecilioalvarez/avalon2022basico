package es.avalon.objetos.Ejemplo14;



public class Principal {
    public static void main(String[] args) {
        Ordenador o1 = new Ordenador(new Nas());
        //Ordenador o2 = new Ordenador(new Nas[]{new Nas()});

        //Nas n1=new Nas();
        //o1.getNas().addDisco(new DiscoDuro(200));
        //o1.getNas().addDisco(new DiscoDuro(500));
        //o1.getNas().addDisco(new DiscoDuro(500));
        DiscoDuro d1=new DiscoDuro();
        DiscoDuro d2=new DiscoDuro();
        DiscoDuro d3=new DiscoDuro();
        DiscoDuro d4=new DiscoDuro();
        d1.setCapacidad(500);
        d2.setCapacidad(500);
        d3.setCapacidad(500);
        d4.setCapacidad(500);
        o1.getNas().addDisco(d1);
        o1.getNas().addDisco(d2);
        o1.getNas().addDisco(d3);
        o1.getNas().addDisco(d4);


        
        System.out.println(o1.getNas().tamañoNas());
        System.out.println(o1.getNas().getDiscoDuros().get(0).getCapacidad());
        System.out.println(o1.getNas().getDiscoDuros().get(1).getCapacidad());
        System.out.println(o1.getNas().getDiscoDuros().get(2).getCapacidad());
        System.out.println(o1.getNas().getDiscoDuros().get(3).getCapacidad());

        System.out.println(d1.getCapacidad());
        for (int i=0;i<o1.getNas().getDiscoDuros().size();i++){
            System.out.println(o1.getNas().getDiscoDuros().get(i).getCapacidad());
        }
        System.out.println("...........");
        System.out.println(o1.capacidadDisco());







    }
}
