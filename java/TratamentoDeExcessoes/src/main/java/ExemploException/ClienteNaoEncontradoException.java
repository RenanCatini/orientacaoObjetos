package ExemploException;

public class ClienteNaoEncontradoException extends Exception{
    private  int codidoErro;

    public ClienteNaoEncontradoException(String message, int codidoErro) {
        super(message);
        this.codidoErro = codidoErro;
    }

    public int getCodidoErro() {
        return codidoErro;
    }

    public void setCodidoErro(int codidoErro) {
        this.codidoErro = codidoErro;
    }
}
