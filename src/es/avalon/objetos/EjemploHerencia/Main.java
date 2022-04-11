package es.avalon.objetos.EjemploHerencia;

public class Main {
    public static void main(String[] args) {
        Persona p=new Persona("David",34);
        p.andar();
        Deportista raquel = new Deportista("raquel",32,"Karate");
        raquel.andar();
        Persona superDeportista = new SuperDeportista("miguel",30,"Motociclismo",2);
        superDeportista.andar();


        System.out.println("*********************************************************");
        raquel.andar();
        superDeportista.andar();
    }
}
