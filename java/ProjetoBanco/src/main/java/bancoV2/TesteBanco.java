package bancoV2;

public class TesteBanco {
    public static void main(String[] args) {
        System.out.println("Criando o cliente Bruno Henrique.");
        Cliente bruno = new Cliente("Bruno", "Henrique");

        System.out.println("Criando uma conta com o saldo de R$50.000,00 para o cliente Bruno Henrique.");
        bruno.setConta(new Conta(50000));

        System.out.println("Sacando R$1.200,00 : " + bruno.getConta().sacar(1200));
        System.out.println("Depositando R$8.525,00 : " + bruno.getConta().depositar(8525));
        System.out.println("Sacando R$12.800,00 : " + bruno.getConta().sacar(12800));
        System.out.println("Sacando R$50.000,00 : " + bruno.getConta().sacar(50000));

        System.out.println("O saldo da conta é: R$" + bruno.getConta().getSaldo());

    }
}
