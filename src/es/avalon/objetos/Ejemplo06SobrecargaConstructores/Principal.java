package es.avalon.objetos.Ejemplo06SobrecargaConstructores;

public class Principal {

    public static void main(String[] args) {

        Persona p = new Persona();
        Persona p1 = new Persona("David");
        Persona p2 = new Persona("1234567S","Gema", 20);
    }
}
