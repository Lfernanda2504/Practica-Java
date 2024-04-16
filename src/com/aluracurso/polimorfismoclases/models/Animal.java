package com.aluracurso.polimorfismoclases.models;

public class Animal {
    private String nombre;
    private double peso;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void hacerRuido() {
        System.out.println("¡Haciendo ruido!");
    }

}
