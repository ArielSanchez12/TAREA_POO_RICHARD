public class CuentaCorriente extends CuentaBancaria {
    private static final double COMISION = 0.02;

    public CuentaCorriente(String numeroCuenta, Cliente cliente) {
        super(1000, numeroCuenta, cliente);
    }

    @Override
    public void retirar(double monto) {
        double montoConComision = monto + (monto * COMISION);
        if (getSaldo() >= montoConComision) {
            setSaldo(getSaldo() - montoConComision);
            System.out.println("Retiro realizado con comisión. Nuevo saldo: $" + getSaldo());
        } else {
            System.out.println("Fondos insuficientes para realizar el retiro.");
        }
    }
}
