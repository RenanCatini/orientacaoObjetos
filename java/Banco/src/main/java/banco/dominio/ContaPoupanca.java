package banco.dominio;

public class ContaPoupanca extends Conta {

    private double taxaDeRendimento;

    public ContaPoupanca(double saldo, double rendimento) {
        super(saldo);
        taxaDeRendimento = rendimento;
    }
    public double getTaxaDeRendimento(){
        return taxaDeRendimento;
    }
}
