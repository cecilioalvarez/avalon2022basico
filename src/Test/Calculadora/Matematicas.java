package Test.Calculadora;

public class Matematicas {
    private double n1;
    private double n2;

    public Matematicas(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public  double sumar (){
        return n1+n2;
    }
    public  double restar (){
        return n1-n2;
    }
    public  double producto (){
        return n1*n2;
    }
    public double division (){
        return n1/n2;
    }
}
