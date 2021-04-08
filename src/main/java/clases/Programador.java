package clases;

public class Programador extends Empleado {

    private double horas;

    public Programador(int codigo, String nombre, int edad, double horas) {
        super(codigo, nombre, edad);
        this.horas = horas;
    }

    public double pagoInicial() {

        if (super.calificacion().equals("Principiante")) {

            return 20;

        } else if (super.calificacion().equals("Intemedio")) {

            return 25;

        } else {

            return 28;

        }

    }

    public double bonificacion() {

        if (horas > 100) {

            return pagoInicial() * 0.10;

        } else {

            return 0;

        }

    }

    public double pagoFinal() {

        return pagoInicial() + bonificacion();

    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

}
