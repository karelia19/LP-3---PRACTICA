package laboratorio2;

public class Cuenta {
    private String numeroCuenta;
    private double saldo;

    public Cuenta(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Depósito de S/." + monto + " realizado.");
    }

    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro de S/." + monto + " realizado.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Cuenta [Número=" + numeroCuenta + ", Saldo=S/." + saldo + "]";
    }
}

