package es.avalon.objeto.ejemplo08;

public class principal {
    public static void main(String[] args){
        lamparatecho lt= new lamparatecho(5,150);
        System.out.println(lt.pTotal());

        lt.setBomb(5,150);
        System.out.println(lt.pTotal());



    }




}
