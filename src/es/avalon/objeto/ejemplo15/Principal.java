package es.avalon.objeto.ejemplo15;

public class Principal {
    public  static void main(String[] args) {

        Persona p=new Persona("pedro",20);
        p.andar();
        //apunta a la zona de momoria donde esta el deportista
        // apunta a un abjeto con una variable de su calse padre
      Persona maria=new Deportista("maria", 30, "tenis");
        Persona sDeportista= new SupeDeportista("gema", 35, "balocesto", 2);

        System.out.println("*************************");
        //maria es una variable de tipo persona
        maria.andar();
        //sdeportista es una variable de tipo persona

        sDeportista.andar();
        System.out.println("***********************");



    }
}
