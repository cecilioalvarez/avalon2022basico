package es.avalon.EjemplosPropios.ejemplo1;

public abstract class DBObject {
    private int id;

    protected DBObject(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract String getSerializedText();
}
