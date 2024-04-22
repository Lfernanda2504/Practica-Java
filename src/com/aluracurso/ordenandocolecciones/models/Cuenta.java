package com.aluracurso.ordenandocolecciones.models;

public class Cuenta implements Comparable<Cuenta>{
    private int numero;
    private String titular;


    public Cuenta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    protected double saldo;

    public void retirar(double valor) {
        if (valor <= 0) {
            System.out.println("El valor debe ser mayor que cero");
        } else if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Retiro realizado com éxito. Saldo actual: " +saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com éxito. Saldo actual: " +saldo);
        } else {
            System.out.println("El valor debe ser mayor que cero");
        }
    }

    //getters y setters

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public int compareTo(Cuenta otraCuenta) {
        if (this.numero < otraCuenta.numero) {
            return -1;
        }
        if (this.numero > otraCuenta.numero) {
            return 1;
        }
        return 0;
    }
}
