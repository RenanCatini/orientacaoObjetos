package banco;

import java.util.Scanner;

public class TesteContaTeclado {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\t\n- Criar Conta -");
        System.out.print("Digite o valor da conta a ser criada: ");
        double saldoInicial = sc.nextDouble();
        Conta conta = new Conta(saldoInicial);

        int opc;
        do{
            limparTela();
            System.out.println("\t- Sua conta -");
            System.out.println("Saldo: R$" + conta.getSaldo() + "\n");

            System.out.println("\t- Opções -");
            System.out.println("1) Sacar");
            System.out.println("2) Depositar");
            System.out.println("3) Sair");
            System.out.print("- Digite aqui a opção desejada :");
            opc = sc.nextInt();

            switch (opc){
                case 1:
                    System.out.println("\n\t - Saque -");
                    System.out.print("Digite o quando deseja sacar: ");
                    double saque = sc.nextDouble();
                    conta.sacar(saque);

                    break;

                case 2:
                    System.out.println("\n\t - Deposito -");
                    System.out.print("Digite o quando deseja depositar: ");
                    double deposito = sc.nextDouble();
                    conta.depositar(deposito);
                    break;

                case 3:
                    break;

                default:
                    break;
            }

        } while(opc != 3);
    }

    private static void limparTela(){
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

}
