package banco.dominio;

import java.util.HashMap;

public class Banco {
    private HashMap<String, Cliente> clientes;
    private static final Banco banco = new Banco();

    private Banco() {
        clientes = new HashMap<>();
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.put(cliente.getCpf(), cliente);
    }

    public Cliente getCliente(String cpf) {
        return clientes.get(cpf);
    }

    public static Banco getBanco() {
        return banco;
    }
}
