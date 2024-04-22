package com.aluracurso.ordenandocolecciones.models;

public class CuentaAhorro extends Cuenta {

    private double tasaDeIntereses;

    public CuentaAhorro(int numero, String titular) {
        super(numero, titular);
    }

    public void calcularIntereses() {
        double intereses= this.saldo * tasaDeIntereses;
        System.out.println("Intereses actuales : " + intereses);
    }

    public void retirar(double valor) {
        double tasaDeRetiro= 0.01;
        super.retirar(valor + tasaDeRetiro);
    }

    public double getTasaDeIntereses() {
        return tasaDeIntereses;
    }

    public void setTasaDeIntereses(double tasaDeIntereses) {
        this.tasaDeIntereses = tasaDeIntereses;
    }


}

