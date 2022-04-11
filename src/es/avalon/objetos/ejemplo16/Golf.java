package es.avalon.objetos.ejemplo16;
//Usando extends llamamos a la clase desde donde
//queremos usar los metodos
//acto seguido ejecutamos @Override
public class Golf extends Coche{
    @Override
    public void girar() {
        System.out.println("El Golf gira");
    }

    @Override
    public void cambiarMarcha() {
        System.out.println("El Golf cambia de marcha");
    }
}
