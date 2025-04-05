package encapsulamento.versao1;

public class TesteVeiculo1 {

    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo(10000);
        System.out.println("Criando um veículo com garga máxima de " + veiculo.getCargaMaxima() + " Kg.");

        veiculo.carga = veiculo.carga + 500;
        System.out.println("Adicionando caixa número 1 (500kg)");

        veiculo.carga = veiculo.carga + 250;
        System.out.println("Adicionando caixa número 2 (250kg)");

        veiculo.carga = veiculo.carga + 5000;
        System.out.println("Adicionando caixa número 3 (5000kg)");

        veiculo.carga = veiculo.carga + 4000;
        System.out.println("Adicionando caixa número 4 (4000kg)");

        veiculo.carga = veiculo.carga + 300;
        System.out.println("Adicionando caixa número 5 (300kg)");

        System.out.println("A carga do veículo é : " + veiculo.carga + " Kg.");

    }
}
