package encapsulamento.versao2;

public class TesteVeiculo2 {

    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo(10000);
        System.out.println("Criando um veículo com a carga máxima de " + veiculo.getCargaMaxima() + " Kg.");

        System.out.println("Adicionando a caixa número 1 (500Kg) : " + veiculo.adicionarCaixa(500));

        System.out.println("Adicionando a caixa número 2 (250Kg) : " + veiculo.adicionarCaixa(250));

        System.out.println("Adicionando a caixa número 3 (5000Kg) : " + veiculo.adicionarCaixa(5000));

        System.out.println("Adicionando a caixa número 4 (4000Kg) : " + veiculo.adicionarCaixa(4000));

        System.out.println("Adicionando a caixa número 5 (300Kg) : " + veiculo.adicionarCaixa(300));

        System.out.println("A carga do veículo é: " + veiculo.getCarga() + " Kg.");

    }
}
