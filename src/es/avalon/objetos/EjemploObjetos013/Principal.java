package es.avalon.objetos.EjemploObjetos013;

public class Principal {
    public static void main(String[] args) {
        Persona  p = new Persona("Wiilson", 30);
        p.andar();
        Deportista Maria = new Deportista("Maria", 30, "Tenis");
        Maria.andar();
        SuperDeportista sDeportista = new SuperDeportista("Pedro",29,"Futbol");
        sDeportista.andar();
    }
}
