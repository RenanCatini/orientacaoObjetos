package bancoV3;


public class TesteBanco {
    public static void main(String[] args) {

        Banco meuBanco = new Banco();

        Cliente bruno = new Cliente("Bruno", "Henrique");
        bruno.setConta(new Conta(50000));
        meuBanco.adicionarCliente(bruno);
        imprimeCliente(meuBanco);

        Cliente everton = new Cliente("Everton", "Ribeiro");
        everton.setConta(new Conta(45000));
        meuBanco.adicionarCliente(everton);
        imprimeCliente(meuBanco);

        Cliente filipe = new Cliente("Filipe", "Luís");
        filipe.setConta(new Conta(70000));
        meuBanco.adicionarCliente(filipe);
        imprimeCliente(meuBanco);

        Cliente gabriel = new Cliente("Gabriel", "Barbosa");
        gabriel.setConta(new Conta(220000));
        meuBanco.adicionarCliente(gabriel);
        imprimeCliente(meuBanco);

        Cliente diego = new Cliente("Diego", "Alves");
        diego.setConta(new Conta(50000));
        meuBanco.adicionarCliente(diego);
        imprimeCliente(meuBanco);



    }


    public static void imprimeCliente(Banco banco) {
        int num = banco.getNumeroDeClientes();
        System.out.println("Cliente [" + num + "] : " + banco.getCliente(num).getNome() +
            " " + banco.getCliente(num).getSobrenome() + ". Saldo de R$" +
            banco.getCliente(num).getConta().getSaldo());
    }

}
