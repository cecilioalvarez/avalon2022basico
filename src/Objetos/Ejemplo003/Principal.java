package Objetos.Ejemplo003;

public class Principal {
    public static void main(String[] args) {
        Nota f = new Nota();//intancia de objeto
        Nota f1 = new Nota();//intancia de objeto

        f.setAsignatura("matematicas");
        f.setNota(6.25);
        f1.setAsignatura("Ingles");
        f1.setNota(3);

        System.out.println(f.getAsignatura()+" tiene nota de: "+f.getNota() + " por tanto esta "+f.isAprobada());
        System.out.println(f1.getAsignatura()+" tiene nota de: "+f1.getNota() + " por tanto esta "+f1.isAprobada());

    }
}
