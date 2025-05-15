package banco;

import java.util.Scanner;

public class TesteBanco {

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

                    meuBanco.adicionarCliente(new Cliente(nome, sobrenome));

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

                            System.out.println("- Opções -");
                            System.out.println("1) Criar Conta Corrente");
                            System.out.println("2) Criar Conta Poupança");
                            System.out.println("3) Escolha a conta a ser alterada");
                            System.out.println("4) Sair da conta");
                            System.out.print("- Digite a opção desejada: ");
                            opc2 = sc.nextInt();

                            int valor, saldoInicial;

                            switch (opc2) {
                                case 1:
                                    System.out.println("\n-- Criar Conta Corrente --");
                                    System.out.print("- Entre com o saldo inicial: ");
                                    saldoInicial = sc.nextInt();
                                    sc.nextLine();
                                    System.out.print("- Entre com o cheque especial: ");
                                    int chequeEspecial = sc.nextInt();
                                    sc.nextLine();
                                    meuBanco.getCliente(login).adicionarConta(new ContaCorrente(saldoInicial,chequeEspecial));
                                    break;

                                case 2:
                                    System.out.println("\n -- Criar Conta Poupança --");
                                    System.out.print("- Entre com o saldo inicial: ");
                                    saldoInicial = sc.nextInt();
                                    System.out.print("- Entre com o valor de rendimento; ");
                                    double rendimento = sc.nextDouble();
                                    meuBanco.getCliente(login).adicionarConta(new ContaPoupanca(saldoInicial, rendimento));

                                    sc.nextLine();
                                    break;

                                case 3:
                                    System.out.println("\n -- Alterar a Conta -- ");
                                    if (meuBanco.getCliente(login).getNumeroDeContas() == 0) {
                                        System.out.println("Você não possui nenhuma conta em seu nome!\n");
                                        break;
                                    }
                                    else {
                                        for(int i = 0; i < meuBanco.getCliente(login).getNumeroDeContas(); i++){
                                            if(meuBanco.getCliente(login).getConta(i) instanceof ContaCorrente){
                                                System.out.println(i + ") Conta Corrente:");
                                                System.out.println("\t-Cheque Especial = R$" + ((ContaCorrente) meuBanco.getCliente(login).getConta(i)).getChequeEspecial());
                                            }
                                            else if(meuBanco.getCliente(login).getConta(i) instanceof ContaPoupanca) {
                                                System.out.println(i + ") Conta Poupança:  ");
                                                System.out.println("\t-Valor de rendimento: " + ((ContaPoupanca) meuBanco.getCliente(login).getConta(i)).getTaxaDeRendimento());
                                            }
                                            System.out.println("\t-Saldo = R$" + meuBanco.getCliente(login).getConta(i).getSaldo() + "\n");
                                        }
                                    }
                                    System.out.print("- Insira a conta desejada a ser alterada: ");
                                    int alt = sc.nextInt();

                                    if(alt > meuBanco.getCliente(login).getNumeroDeContas()){
                                        System.out.println("Conta não existente!");
                                        break;
                                    }

                                    int opc3;
                                    do{
                                        System.out.println("\n - Saldo: R$" + meuBanco.getCliente(login).getConta(alt).getSaldo());
                                        System.out.println("1) Sacar");
                                        System.out.println("2) Depositar");
                                        System.out.println("3) Sair");
                                        System.out.print("- O que deseja fazer: ");
                                        opc3 = sc.nextInt();

                                        switch (opc3) {
                                            case 1:
                                                System.out.print("-Qual valor será sacado: ");
                                                double sacar = sc.nextDouble();
                                                boolean sacou;
                                                if (meuBanco.getCliente(login).getConta(alt) instanceof ContaCorrente){
                                                    sacou = ((ContaCorrente) meuBanco.getCliente(login).getConta(alt)).sacar(sacar);
                                                }
                                                else{
                                                    sacou = meuBanco.getCliente(login).getConta(alt).sacar(sacar);
                                                }

                                                if(sacou) {
                                                    System.out.println("\n Saque efetuado com sucesso!");
                                                }
                                                else {
                                                    System.out.println("\n Saque não foi efetuado!");
                                                }

                                                break;

                                            case 2:
                                                System.out.print("-Qual valor será depositado: ");
                                                double depositar = sc.nextDouble();
                                                meuBanco.getCliente(login).getConta(alt).depositar(depositar);
                                                System.out.println("\n Deposito efetuado com sucesso!");
                                                break;

                                            case 3:
                                                break;

                                            default:
                                                System.out.println("\nOpção Inválida!");
                                                break;
                                        }
                                    }while(opc3 != 3);

                                    break;

                                case 4:
                                    break;


                                default:
                                    System.out.println("\nOpção não inválida!\n");
                                    break;
                            }

                        } while (opc2 != 4);
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
