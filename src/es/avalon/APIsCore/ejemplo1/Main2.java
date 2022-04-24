package es.avalon.APIsCore.ejemplo1;

public class Main2 {
    //Usos de la los tipos Double(clase coraza) y tipo basico double
    public static void main(String[] args) {
        String numero1 = "20.20";
        String numero2 = "40.40";

        double n1 = Double.parseDouble(numero1);
        double n2 = Double.parseDouble(numero2);

        double resultado = n1 + n2;
        System.out.println(resultado);
    }
}
