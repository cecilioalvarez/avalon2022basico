package es.avalon.objetos.ejemplo18;

public class Principal {
    public static void main(String[] args){
        Documento d=new Documento("Los 4 acuerdos",200);
        d.coleccion();
        Documento libro=new Libro("Poder sin Limite",100," Tony Robbins"," Libro de autoayuda",2,5);
        libro.coleccion();
        Documento comic=new Comic("Iron Man",15,"Stan lee","Marvel",2,5,"Verde");
        comic.coleccion();
        Documento apuntes=new Apuntes(" Java",25,"Programacion");
        apuntes.coleccion();
        //System.out.println(d.getTitulo());
        // System.out.println(libro.getTitulo());
        //System.out.println(comic.getTitulo());
        //System.out.println(apuntes.getTitulo());



    }

}
