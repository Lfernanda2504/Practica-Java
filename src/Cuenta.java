public class Cuenta {

    private String titular;
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
}
