package es.avalon.objetos.ejemplo09;

public class Principal {
    public static void main(String[] args){

        persona p1= new persona("edwoin",21);
        telefono t1=new telefono("samsung",3221212);
                p1.setTele(t1);
        System.out.println(p1.getTele().getNumero());
    }

}
