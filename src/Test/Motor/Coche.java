package Test.Motor;

public class Coche {
    private String Marca;
    private Motor motor;

    public Coche(String marca, Motor motor) {
        Marca = marca;
        this.motor = motor;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    public double getPotencia(){
        return motor.getPotencia()-10;
    }
    public double getConsumoGasolina(){
        return motor.getConsumoGasolina();
    }
}
