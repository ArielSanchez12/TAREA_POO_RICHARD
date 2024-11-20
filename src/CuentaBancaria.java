public abstract class CuentaBancaria {
    private double saldo;
    private String numeroCuenta;
    private Cliente cliente;

    // Constructor
    public CuentaBancaria(double saldoInicial, String numeroCuenta, Cliente cliente) {
        this.saldo = saldoInicial;
        this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
    }

    // Métodos
    public double getSaldo() {
        return saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Depósito realizado. Nuevo saldo: $" + saldo);
    }

    public abstract void retirar(double monto);

    public void mostrarInformacion() {
        cliente.mostrarInformacion();
        System.out.println("Número de Cuenta: " + numeroCuenta);
        System.out.println("Saldo: $" + saldo);
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
