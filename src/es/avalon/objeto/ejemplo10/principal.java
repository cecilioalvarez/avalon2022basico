package es.avalon.objeto.ejemplo10;

public class principal {
    public static  void main(String[] args) {

        persona p2 = new persona();
        telefono t1 = new telefono("samsung", 234556665);
        p2.setTelefono(t1);
        System.out.println(p2.getTelefono().getNumero());


    }
}

