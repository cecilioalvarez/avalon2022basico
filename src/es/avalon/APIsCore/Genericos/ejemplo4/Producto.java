package es.avalon.APIsCore.Genericos.ejemplo4;

public interface Producto {
    //permite a una clase concretar su precio
    public void setPrecio(double precio);
    public double getPrecio();
}
