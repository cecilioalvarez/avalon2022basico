package es.avalon.APIsCore.Genericos.ejemplo2;

public class PackDoble<T> {

    private T item1;
    private T item2;

    public boolean iguales(){
        return item1.equals(item2);
    }

    public PackDoble(T item1, T item2) {
        super();
        this.item1 = item1;
        this.item2 = item2;
    }

    public T getItem1() {
        return item1;
    }

    public void setItem1(T item1) {
        this.item1 = item1;
    }

    public T getItem2() {
        return item2;
    }

    public void setItem2(T item2) {
        this.item2 = item2;
    }
}
