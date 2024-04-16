package com.aluracurso.polimorfismoclases.models;

public class Main {
    public static void main(String[] args) {
        Animal miMascota = new Perro();
        miMascota.hacerSonido(); // Salida: El perro ladra

        miMascota = new Gato();
        miMascota.hacerSonido(); // Salida: El gato maulla
    }
}
