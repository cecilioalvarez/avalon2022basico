package es.avalon.objetos.ejemplo10;

public class Principal {
    public static  void main(String[] args){

        Persona p2=new Persona();
        Telefono t1=new Telefono("samsung",234556665);
        p2.setTelefono(t1);
        System.out.println(p2.getTelefono().getNumero());

    }
}
