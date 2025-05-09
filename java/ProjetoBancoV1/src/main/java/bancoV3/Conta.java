package bancoV3;

public class Conta {
    private double saldo;

    public Conta(double saldoInicial){
        saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean depositar(double valor) {
        saldo += valor;
        return true;
    }

    public boolean sacar(double saque) {
        if(saque > saldo) {
            return false;
        }
        saldo -= saque;
        return true;
    }


}
