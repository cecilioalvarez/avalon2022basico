package es.avalon.testing.ejemplo03Coche;

public class Coche {

    private String marca;
    private Motor motor;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Coche(String marca, Motor motor) {
        this.marca = marca;
        this.motor = motor;
    }

    public Coche() {
    }

    public double getPotencia(){

        //Le reducimos algo de potencia al montarlo al coche (Aunque no sabemos si es el calculo correcto)
        return motor.getPotencia()-10;
    }
}
