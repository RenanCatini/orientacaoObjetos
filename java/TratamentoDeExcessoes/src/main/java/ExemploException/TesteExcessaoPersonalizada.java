package ExemploException;

public class TesteExcessaoPersonalizada {

    public static void main(String[] args) {
        TesteExcessaoPersonalizada teste = new TesteExcessaoPersonalizada();
        try {
            teste.consultarCliente("");
        } catch (ClienteNaoEncontradoException exc) {
            System.out.println(exc.getMessage() + ", código: " + exc.getCodidoErro());
        }

    }

    public void consultarCliente(String nome) throws ClienteNaoEncontradoException{
        if(nome.equals("")) {
            throw new ClienteNaoEncontradoException("Cliente não cadastrado", 2);
        }
        System.out.println("Sucesso. Excessão não lançada.");
    }
}
