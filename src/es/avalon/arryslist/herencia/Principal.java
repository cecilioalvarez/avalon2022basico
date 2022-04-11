package es.avalon.arryslist.herencia;

public class Principal {

     public static void main(String[] args) {
         Persona p = new Persona("santiago",120);
         p.andar();
         Persona maria = new Deportista("Maria",30,"Tenis");
         maria.andar();
         Persona sDeportista = new SuperDeportista("gema",35,"futbol",1);
         sDeportista.andar();

    }
}
