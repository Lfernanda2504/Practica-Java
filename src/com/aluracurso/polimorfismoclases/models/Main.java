package com.aluracurso.polimorfismoclases.models;

public class Main {
    public static void main(String[] args) {
        Animal miMascota = new Perro();
        miMascota.hacerRuido(); // Salida: El perro ladra

        miMascota = new Gato();
        miMascota.hacerRuido(); // Salida: El gato maulla
    }
}
