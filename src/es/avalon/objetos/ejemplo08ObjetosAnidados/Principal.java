package es.avalon.objetos.ejemplo08ObjetosAnidados;

public class Principal {

    public static void main(String[] args) {

        Persona p2 = new Persona("1234567S","Gema", 20);
        Telefono t1 = new Telefono("Samsung", 123456789);

        p2.setTelefono(t1);

        //Obtenemos el objeto telefono y de este el numero
        System.out.println(p2.getTelefono().getNumero());
    }
}
