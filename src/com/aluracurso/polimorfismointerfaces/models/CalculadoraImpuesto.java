package com.aluracurso.polimorfismointerfaces.models;

public class CalculadoraImpuesto {
    private double totalImpuesto = 0;

    public void calcularImpuesto(Tributable item) {
        this.totalImpuesto += item.getValorImpuesto();
    }

    public double getTotalImpuesto() {
        return this.totalImpuesto;
    }
}
