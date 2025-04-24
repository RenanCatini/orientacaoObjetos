package bancoV3;

public class Banco {

    private Cliente[] clientes;
    private int numeroDeClientes;

    public Banco(){
        clientes = new Cliente[6];
        numeroDeClientes = 0;
    }

    public void adicionarCliente (Cliente cliente){
        if(numeroDeClientes <= clientes.length) {
            numeroDeClientes++;
            clientes[numeroDeClientes] = cliente;
        } else {
            System.out.println("\nCapacidade máxima do banco atingida.");
        }

    }

    public Cliente getCliente(int indice) {
        return clientes[indice];
    }

    public int getNumeroDeClientes() {
        return numeroDeClientes;
    }
}
