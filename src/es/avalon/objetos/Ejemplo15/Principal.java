package es.avalon.objetos.Ejemplo15;

public class Principal {
    public static void main(String[] args) {
        Persona p=new Persona("jose",42);
        Persona p1=new Persona("pedro", 34);
        //Apunta a la zona de variable de deportista
        Deportista d1=new Deportista("Juan",36,"Atletismo");
        Deportista d2=new Deportista("Baloncesto");
        SuperDeportista s=new SuperDeportista("Gema",34,"Montañismo",2);
        //apunta a un objeto con una variable de su clase
        //p2 es una variable de tipo persona
        Persona p2=new Deportista("Juan",45,"Baloncesto");
        Persona p3=new SuperDeportista("David",40,"Danza",1);

        System.out.println(d1.getNombre());
        System.out.println(d1.getDeporte());
        System.out.println(d2.getNombre());
        d2.setNombre("Pablo");
        p.andar();
        d1.andar();
        s.andar();
        p2.andar();
        System.out.println(".............");
        p2.andar();
        p3.andar();



    }
}
