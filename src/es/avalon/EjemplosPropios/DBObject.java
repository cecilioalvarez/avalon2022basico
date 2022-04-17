package es.avalon.EjemplosPropios;

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
