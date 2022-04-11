package es.avalon.objetos.ejemplo10Herencia;

public class Principal {

    public static void main(String[] args) {

        Persona p = new Persona("Juan Luis", 29);

        p.andar();
        //Creamos un objeto deportista
        Deportista maria = new Deportista("Maria", 30, "Tenis");
        //Usamos el metodo de la clase padre, pero este esta sobreescrito a conveniencia en la clase hijo
        maria.andar();

        //Creamos un objeto SuperDeportista, este hereda de Deportista, por lo que como vemos podemos tener varios niveles de jerarquia Padre-Hijo
        SuperDeportista sDeportista = new SuperDeportista("Gema", 35, "Baloncesto", 2);
        sDeportista.andar();

        System.out.println("\n ******************* \n");



        //////POLIMORFISMO//////
        //Apuntar a un objeto con una variable de su clase padre.
        //Al hacer esto, estamos alojando la variable en memoria con las propiedades o atributos de la clase indicada, por lo que
        //dejamos de tener acceso a las funcionalidades que en el caso anterior nos proporcionaban las clases hijo

        Persona p1 = new Persona("Juan Luis", 29);

        p1.andar();
        //Creamos un objeto deportista
        Persona maria1 = new Deportista("Maria", 30, "Tenis");
        //Usamos el metodo de la clase padre, pero este esta sobreescrito a conveniencia en la clase hijo
        maria1.andar();

        //Creamos un objeto SuperDeportista, este hereda de Deportista, por lo que como vemos podemos tener varios niveles de jerarquia Padre-Hijo
        Persona sDeportista1 = new SuperDeportista("Gema", 35, "Baloncesto", 2);
        sDeportista1.andar();
    }


}
