package bancoV4;

import java.util.Scanner;


public class TesteBancoTeclado {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Banco meuBanco = new Banco();
        int num_client = 0, opc1, opc2;

        System.out.println("===============Banco================\n");

        do {
            System.out.println("-- Opções --");
            System.out.println("1) Criar novo cliente");
            System.out.println("2) Entrar");
            System.out.println("3) Sair");
            System.out.print("- Escolha a opção: ");
            opc1 = sc.nextInt();

            switch (opc1) {
                case 1:
                    System.out.println("\n-- Criar Cliente --");

                    System.out.print("- Digite o nome seu nome: ");
                    sc.nextLine();
                    String nome = sc.nextLine();

                    System.out.print("- Digite o nome seu sobrenome: ");
                    String sobrenome = sc.nextLine();

                    System.out.print("- Digite o saldo inicial da sua conta: ");
                    int saldoInicial = sc.nextInt();

                    meuBanco.adicionarCliente(new Cliente(nome, sobrenome, new Conta(saldoInicial)));

                    System.out.println("\n- Cliente criado com sucesso!\n");
                    break;

                case 2:
                    System.out.println("\n-- Clientes --");
                    listaClientes(meuBanco);

                    System.out.print("\n- Escolha qual cliente deseja entrar:");
                    int login = sc.nextInt();

                    if (login < meuBanco.getNumeroDeClientes() && login >= 0) {
                        do {
                            System.out.println("\n -- Sua conta --");
                            System.out.println("\n Olá " + meuBanco.getCliente(login).getNome());
                            System.out.println(" Seu saldo atual: R$" +
                                    meuBanco.getCliente(login).getConta().getSaldo() + "\n");

                            System.out.println("- Opções -");
                            System.out.println("1) Sacar");
                            System.out.println("2) Depositar");
                            System.out.println("3) Sair da conta");
                            System.out.println("- Digite a opção desejada: ");
                            opc2 = sc.nextInt();

                            int valor;

                            switch (opc2) {
                                case 1:
                                    System.out.println("\n -- Sacar --");
                                    System.out.print("- Digite o valor a ser sacado: ");
                                    valor = sc.nextInt();

                                    if (meuBanco.getCliente(login).getConta().sacar(valor)) {
                                        System.out.println("Saque feito com sucesso!");
                                    } else {
                                        System.out.println("Saldo Insuficiente!");
                                    }
                                    break;

                                case 2:
                                    System.out.println("\n -- Depositar --");
                                    System.out.print("- Digite o valor a ser depositado: ");
                                    valor = sc.nextInt();

                                    meuBanco.getCliente(login).getConta().depositar(valor);
                                    System.out.println("\nDeposito feito com sucesso!");
                                    break;

                                case 3:
                                    break;

                                default:
                                    System.out.println("\nOpção não existe!\n");
                                    break;
                            }

                        } while (opc2 != 3);
                    } else {
                        System.out.println("Opção não existe!");
                    }
                    break;

                case 3:
                    break;

                default:
                    System.out.println("\n\nOpção Invalida!");
                    break;
            }

        }while(opc1 != 3);

    }

    public static void listaClientes(Banco banco) {
        for (int i = 0; i < banco.getNumeroDeClientes(); i++) {
            System.out.println("-[" + i + "]: " + banco.getCliente(i).getNome() + " "
                    + banco.getCliente(i).getSobrenome());
        }
    }

}
