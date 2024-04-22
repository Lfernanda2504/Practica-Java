package com.aluracurso.ordenandocolecciones.models;

import java.util.Comparator;

public class TitularComparator implements Comparator<Cuenta> {
    @Override
    public int compare(Cuenta cuenta, Cuenta otraCuenta) {
        return cuenta.getTitular().compareTo(otraCuenta.getTitular());
    }
}
