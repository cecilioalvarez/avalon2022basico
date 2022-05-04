package jdbc;

public class PrincipalAddRecord {
    private String dni;
    private String Nombre;
    private String Apellido;

    public PrincipalAddRecord(String dni, String nombre, String apellido) {
        this.dni = dni;
        Nombre = nombre;
        Apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }
}
