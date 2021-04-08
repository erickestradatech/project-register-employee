package clases;

public class Analista extends Empleado {

    private int dias;

    public Analista(int codigo, String nombre, int edad, int dias) {
        super(codigo, nombre, edad);
        this.dias = dias;
    }

    public double pagoAnalista() {

        if (super.calificacion().equals("Principiante")) {

            return 80;

        } else if (super.calificacion().equals("Intemedio")) {

            return 110;

        } else {

            return 150;

        }
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

}
