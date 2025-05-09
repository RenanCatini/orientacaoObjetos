package Banco;

import java.util.ArrayList;

public class Banco {

    ArrayList<Cliente> clientes = new ArrayList<>();
    private int numeroDeClientes;

    public Banco(){
        numeroDeClientes = 0;
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
        numeroDeClientes++;
    }

    public int getNumeroDeClientes() {
        return numeroDeClientes;
    }

    public Cliente getCliente(int indice) {
        return clientes.get(indice);
    }

}
