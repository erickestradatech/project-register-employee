package clases;

import java.util.ArrayList;

public class Arreglo_Empleado {

    private ArrayList<Empleado> lista;

    public Arreglo_Empleado() {

        lista = new ArrayList();

        lista.add(new Programador(1001, "Erick", 21, 12.7));
        lista.add(new Programador(1002, "Carla", 22, 14.4));
        lista.add(new Programador(1003, "Andres", 23, 16.6));
        lista.add(new Programador(1004, "Juan", 21, 14.5));
        lista.add(new Analista(1005, "Andres", 24, 180));
        lista.add(new Programador(1006, "Sandra", 21, 16.3));
        lista.add(new Analista(1007, "Miranda", 24, 321));

    }

    public void adi_Programador(Programador p) {

        lista.add(p);
    }

    public void adi_Analista(Analista a) {

        lista.add(a);
    }

    public ArrayList<Empleado> listado() {

        return lista;
    }

    public Empleado busca(int nro) {

        for (Empleado x : lista) {

            if (x.getCodigo() == nro) {

                return x;
            }

        }

        return null;
    }

    public void borra(Empleado em) {

        lista.remove(em);
    }
}
