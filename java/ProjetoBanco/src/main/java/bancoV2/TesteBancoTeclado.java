package bancoV2;

import java.util.Scanner;

public class TesteBancoTeclado {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("\t===Criação de Conta===");

        System.out.print("-Digite seu nome: ");
        String nomeCliente = sc.nextLine();
        System.out.print("-Digite seu sobrenome: ");
        String sobrenomeCliente = sc.nextLine();
        Cliente cliente = new Cliente(nomeCliente, sobrenomeCliente);

        System.out.print("-Digite o valor inicial de sua conta: ");
        cliente.setConta(new Conta(sc.nextDouble()));

        int opc;
        do{
            System.out.println("\n===Banco===");
            System.out.println("- Cliente: " + cliente.getNome());
            System.out.println("- Seu saldo atual: R$" + cliente.getConta().getSaldo());

            System.out.println("\n===Opções===");
            System.out.println("1) Sacar");
            System.out.println("2) Depositar");
            System.out.println("3) Sair");
            System.out.print("- Digite a opção desejada: ");
            opc = sc.nextInt();

            switch (opc){
                case 1:
                    System.out.println("\n-Sacar-");
                    System.out.print("Digite o valor a ser sacado: ");
                    double valorSacado = sc.nextDouble();
                    if(cliente.getConta().sacar(valorSacado)){
                        System.out.println("\n\n- Saque de R$" + valorSacado + "  foi realizado com suceso!");
                    } else {
                        System.out.println("\n\n- Saque não realizado, saldo insuficiente!");
                    }
                    break;

                case 2:
                    System.out.println("\n-Depositar-");
                    System.out.print("Digite o valor a ser depositado: ");
                    cliente.getConta().depositar(sc.nextDouble());
                    break;

                case 3:
                    break;

                default:
                    System.out.println("\n\nOpção Invalida!");
                    break;
            }

        }while(opc != 3);

    }

}
