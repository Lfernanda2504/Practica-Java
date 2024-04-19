package com.aluracurso.polimorfismointerfaces.models;
/**un sistema de ventas que necesita calcular el impuesto de
 * diferentes tipos de productos. Podemos crear la interfaz
 * "Tributable" para definir el comportamiento de cálculo de
 * impuestos y luego crear varias clases diferentes que implementen esta
 * interfaz para calcular el impuesto de diferentes productos.**/
public interface Tributable {
    double getValorImpuesto();
}
