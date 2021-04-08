package clases;

public class Empleado {

    private int codigo;
    private String nombre;
    private int edad;

    public Empleado(int codigo, String nombre, int edad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String calificacion() {

        if (edad <= 21) {

            return "Principiante";

        } else if (edad >= 22 && edad <= 35) {

            return "Intermedio";

        } else {

            return "Senior";
        }

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

}
