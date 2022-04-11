package es.avalon.objeto.ejemplo18;

public class Principal {
    public static void main(String[] args){

    Documento d=new Documento("DeshojandoMargaritas",76);
    Libro l=new Libro("deshojandoMargaritas" ,76 , "WalterRiso" , "Planeta" ,2);
    Comic c=new Comic("deshojandoMargaritas" ,76,"walterRiso","planera" , 2, "Morado");
    Aputes a=new Aputes("eshojandoMargaritas" ,76 , "Autoayuda");
    System.out.println(d.getTitulo());
    System.out.println(d.getPagina());








    }
}
