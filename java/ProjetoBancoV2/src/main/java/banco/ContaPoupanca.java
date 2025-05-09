package banco;

public class ContaPoupanca extends Conta {

    private double taxaDeRendimento;

    public ContaPoupanca(double saldo, double rendimento) {
        super(saldo);
        taxaDeRendimento = rendimento;
    }
}
