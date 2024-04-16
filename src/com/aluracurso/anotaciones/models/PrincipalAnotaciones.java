package com.aluracurso.anotaciones.models;

import java.time.LocalDate;
import java.time.Month;

import static com.aluracurso.anotaciones.models.Usuario.validador;


public class PrincipalAnotaciones {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Maria", "52902488033", LocalDate.of(2005, Month.JANUARY, 13));
//        System.out.println(validador(usuario));
    }
}
