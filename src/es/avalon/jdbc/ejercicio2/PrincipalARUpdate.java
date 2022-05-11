package es.avalon.jdbc.ejercicio2;

public class PrincipalARUpdate {
    public static void main(String[] args) {
        PersonaAR p= new PersonaAR("2","Manuel",28);
        p.setNombre("Merquiades");
        p.setEdad(30);
        p.update();
    }
}

