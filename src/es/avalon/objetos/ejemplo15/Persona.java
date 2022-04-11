package es.avalon.objetos.ejemplo15;

public class Persona {
    private String name;
    private int edad;

    public Persona(String name, int edad) {
        this.name = name;
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public Persona(){

    }
    public void andar(){
        System.out.println(getName() + " Anda a 5km/h");
    }
}
