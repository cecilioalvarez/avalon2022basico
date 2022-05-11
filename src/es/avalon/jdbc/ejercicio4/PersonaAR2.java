package es.avalon.jdbc.ejercicio4;


import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


import static es.avalon.jdbc.ejercicio4.DataBaseHelper.getConexion;


public class PersonaAR2 {

    /*static final String URL="jdbc:mysql://localhost:3306/cursosql";
    static final  String USUARIO="root";
    static final  String CLAVE="";*/
    private String Dni;
    private String nombre;
    private int edad;

    public String getDni() {
        return Dni;
    }

    public void setDni(String dni) {
        Dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public PersonaAR2(String dni, String nombre, int edad) {
        Dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }

    public void insertar(){
        try (
            Connection con= getConexion();
            PreparedStatement sentencia= con.
                    prepareStatement("insert into personas(Dni,nombre,edad)  values (?,?,?)");)
        {
            sentencia.setString(1,getDni());
            sentencia.setString(2,getNombre());
            sentencia.setInt(3,getEdad());
            sentencia
                    .executeUpdate();



        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void delete(){
        try (
            Connection con = getConexion();
            PreparedStatement sentencia = con.prepareStatement("delete from personas where Dni=?");)
        {
            sentencia.setString(1,getDni());
            sentencia.executeUpdate();

        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void update(){
        try (
            Connection con = getConexion();
            PreparedStatement sentencia = con.prepareStatement("update personas set nombre=?,edad=? where Dni=?");)
        {
            sentencia.setString(1,getNombre());
            sentencia.setInt(2,getEdad());
            sentencia.setString(3,getDni());
            sentencia.executeUpdate();

        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static PersonaAR2 buscarUno(String dni){
        try (
            Connection con= getConexion();
            PreparedStatement sentencia= con.prepareStatement("select * from personas where dni=?");)
        {
            sentencia.setString(1,dni);
            ResultSet rs= sentencia.executeQuery();
            rs.next();
              return new PersonaAR2(rs.getString("dni"),
                      rs.getString("nombre"),rs.getInt("edad"));

        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static List<PersonaAR2> buscarTodos(){
        List<PersonaAR2> lista=new ArrayList<>();

        try (
            Connection con= getConexion();
            PreparedStatement sentencia= con.prepareStatement("select * from personas");)
        {
            ResultSet rs= sentencia.executeQuery();
            while (rs.next()){

                lista.add(new PersonaAR2(rs.getString("dni"),
                rs.getString("nombre"),rs.getInt("edad")));
            }
            return lista;


        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }

    }

    }

