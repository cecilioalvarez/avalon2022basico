package es.avalon.APIsCore.Genericos.ejemplo3;

public interface Producto {
    //permite a una clase concretar su precio
    void setPrecio(double precio);
    double getPrecio();
}
