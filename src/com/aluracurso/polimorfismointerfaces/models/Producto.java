package com.aluracurso.polimorfismointerfaces.models;

public class Producto implements Tributable{
    private String nombre;
    private double valor;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public double getValorImpuesto() {
        return this.valor * 0.1;
    }
}
