package es.avalon.objetos.ejemplo15;

public class Principal {
    public static void main(String[] args) {

        Persona p= new Persona("pedro",20);
        p.andar();
        //apunta a la zona de memoria donde esta el deportista
        //apuntar a un objeto con una variable de su clase padre.
        Persona maria= new Deportista("maria",30,"tenis");
        Persona sDeportista= new SuperDeportista("gema",35,"baloncesto",2);

        System.out.println("**************");
        // maria es una variable de tipo persona
         maria.andar();
        //sdeportista es una variable de tipo persona
        sDeportista.andar();
        System.out.println("**************");







    }
}
