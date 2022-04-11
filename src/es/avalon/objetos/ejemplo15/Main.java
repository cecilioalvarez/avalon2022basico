package es.avalon.objetos.ejemplo15;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.andar();
        //apunta a la zona de memoria donde se almacena deportista
        //apuntar a un objeto con una variable de su clase padre
        Deportista maria = new Deportista("Maria", 25, "Senderismo" );
        Persona deportistaElite = new SuperDeportista("Gema", 23, "Baloncesto", 4);

        System.out.println("******************");
        //Maria es una variablde tipo "Persona"
        maria.andar();
        //deportistaElite es una variable de tipo "Deportista"
        deportistaElite.andar();
        System.out.println("******************");
    }

    //Persona persona = new Persona();
      //  persona.andar();
    //Deportista maria = new Deportista("Maria", 25, "Senderismo" );
       // maria.andar();
    //SuperDeportista deportistaElite = new SuperDeportista("Gema", 23, "Baloncesto", 4);
        //deportistaElite.andar();
}
