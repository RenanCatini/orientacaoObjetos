package bancoV1;

public class TesteConta {

    public static void main(String[] args) {

        Conta conta = new Conta(1000);
        System.out.println("Criando uma conta com o saldo de R$" + conta.getSaldo());

        conta.sacar(250);
        System.out.println("Sacando R$250,00");

        conta.depositar(320.50);
        System.out.println("Depositando R$320,50");

        conta.sacar(120);
        System.out.println("Sacando R$120,00");

        System.out.println("O saldo da conta é de R$ " + conta.getSaldo());

    }

}
