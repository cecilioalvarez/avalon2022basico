package es.avalon.EjemplosPropios.ejemplo2GenericosConInterfaces;

public class HUDHP<TUnit extends Unit> {

    private TUnit unit;

    public HUDHP(TUnit unit) {
        this.unit = unit;
    }

    public TUnit getUnit() {
        return unit;
    }

    public void mostrarVida(){
        System.out.println(unit.getVida());
        if (unit.estaMuerto()){
            System.out.println("La unidad esta muerta");
        }
    }

    public void recibirAtaque(Enemigo enemigo) {
        unit.quitarVida(enemigo.getFuerza());
    }

}
