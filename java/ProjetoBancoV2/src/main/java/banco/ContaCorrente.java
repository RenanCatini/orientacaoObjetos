package banco;

public class ContaCorrente extends Conta{
    private double chequeEspecial;

    public ContaCorrente (double saldoInicial, double chequeEspecial) {
        super(saldoInicial);
        this.chequeEspecial = chequeEspecial;
    }

    public ContaCorrente(double saldoInicial) {
        this(saldoInicial, 0.0);
    }

    public boolean sacar (double valor){
        if (valor > this.saldo + this.chequeEspecial) {
            return false;
        }
        this.saldo -= valor;
        return true;
    }

    public double getChequeEspecial() {
        return this.chequeEspecial;
    }

}
