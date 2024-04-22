package com.aluracurso.ordenandocolecciones.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta(5452, "Phillip Lahm");
        Cuenta cuenta2 = new Cuenta(1234, "Lucas Podolski");
        Cuenta cuenta3 = new Cuenta(3145, "Arne Friedrich");

        List lista = new ArrayList();
        lista.add(cuenta1);
        lista.add(cuenta2);
        lista.add(cuenta3);

        Collections.sort(lista);

        TitularComparator comparator = new TitularComparator();
        Collections.sort(lista, comparator);

    }


}
