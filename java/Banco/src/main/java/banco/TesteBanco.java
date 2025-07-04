package banco;
import banco.dominio.*;

public class TesteBanco {

  public static void main(String[] args) {

    Banco banco = Banco.getBanco();
    Cliente cliente;

    // Cria vários clientes e suas respectivas contas
    System.out.println("Criando uma conta corrente para o cliente Bruno Henrique.");
    Cliente brunoHenrique = new Cliente("Bruno", "Henrique", "426.197.300-04");
    banco.adicionarCliente(brunoHenrique);
    cliente = banco.getCliente(brunoHenrique.getCpf());
    cliente.adicionarConta(new ContaPoupanca(50000.00, 0.03));
    cliente.adicionarConta(new ContaCorrente(220000.00, 40000.00));

    // Criação do cliente Everton Ribeiro e sua respectiva
    // conta corrente com saldo inicial e cheque especial
    System.out.println("Criando uma conta corrente para o cliente Everton Ribeiro");
    Cliente evertonRibeiro = new Cliente("Everton", "Ribeiro", "519.680.220-84");
    Conta contaER = new ContaCorrente(45000, 30000.00);
    evertonRibeiro.adicionarConta(contaER);
    banco.adicionarCliente(evertonRibeiro);

    // Criação do cliente Filipe Luis e sua respectiva
    // conta corrente com saldo inicial, sem cheque especial
    System.out.println("Criando uma conta corrente para o cliente Filipe Luis.");
    Cliente filipeLuis = new Cliente("Filipe", "Luis", "840.179.490-70");
    Conta contaFilipeLuis = new ContaCorrente(70000);
    filipeLuis.adicionarConta(contaFilipeLuis);
    banco.adicionarCliente(filipeLuis);

    System.out.println("Criando uma conta corrente para o cliente Gabriel Barbosa.");
    Cliente gabrielBarbosa = new Cliente("Gabriel", "Barbosa", "765.331.010-01");
    banco.adicionarCliente(gabrielBarbosa);
    cliente = banco.getCliente(gabrielBarbosa.getCpf());
    cliente.adicionarConta(new ContaPoupanca(220000.00, 0.03));

    // Criação do cliente Diego Alves e sua respectiva conta com saldo inicial
    System.out.println("Criando uma conta corrente para o cliente Diego Alves.");
    Cliente diegoAlves = new Cliente("Diego", "Alves", "230.948.720-06");
    Conta contaDA = new ContaCorrente(50000);
    diegoAlves.adicionarConta(contaDA);
    banco.adicionarCliente(diegoAlves);

    // Criação da cliente Lorena Lara com conta conjunta com Diego Alves
    System.out.println("Diego Alves autorizou o cadastro de sua conta corrente como sendo conjunta com a cliente Lorena Lara.");
    Cliente lorenaLara = new Cliente("Lorena", "Lara", "398.715.980-43");
    lorenaLara.adicionarConta(contaDA);
    banco.adicionarCliente(lorenaLara);

  }
}
