package banco;

public class  Cliente {
    private String nome;
    private String sobrenome;
    private ContaPoupanca contaPoupanca;
    private ContaCorrente contaCorrente;

    public Cliente(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.contaPoupanca = null;
        this.contaCorrente = null;
    }

    public Cliente(String nome, String sobrenome, ContaCorrente contaCorrente){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.contaCorrente = contaCorrente;
        this.contaPoupanca = null;
    }

    public Cliente(String nome, String sobrenome, ContaPoupanca contaPoupanca){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.contaCorrente = null;
        this.contaPoupanca = contaPoupanca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Conta getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(ContaCorrente contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public ContaPoupanca getContaPoupanca() {
        return contaPoupanca;
    }

    public void setContaPoupanca(ContaPoupanca contaPoupanca) {
        this.contaPoupanca = contaPoupanca;
    }
}
