package encapsulamento.versao3;

import java.util.Scanner;

public class TesteVeiculo3 {

    private static final Scanner sc = new Scanner(System.in);

    private static void adicionarCaixa(Veiculo veiculo, int numeroCaixa){
        System.out.print("Digite o peso da caixa a ser adicionada: ");
        double pesoCaixa = sc.nextDouble();
        System.out.println("Adicionando a caixa número " + numeroCaixa + " (" + pesoCaixa + "Kg) :"
                + veiculo.adicionarCaixa(pesoCaixa));
    }

    public static void main(String[] args) {

        System.out.print("Insira o peso máximo do veículo: ");
        double pesoMaximo = sc.nextDouble();
        Veiculo veiculo = new Veiculo(pesoMaximo);
        System.out.println("Criando um veículo com a carga máxima de " + veiculo.getCargaMaxima() + " Kg.");

        for(int i = 1; i <= 5; i++){
            adicionarCaixa(veiculo, i);
        }

        System.out.println("A carga do veículo é: " + veiculo.getCarga() + " Kg.");

    }
}
