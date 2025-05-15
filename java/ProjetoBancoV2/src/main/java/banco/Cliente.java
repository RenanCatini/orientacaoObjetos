package banco;

import java.util.ArrayList;

public class  Cliente {
    private String nome;
    private String sobrenome;
    ArrayList<Conta> contas = new ArrayList<>();

    private int numeroDeContas;

    public Cliente(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        numeroDeContas = 0;
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

    public void adicionarConta(Conta conta) {
        contas.add(conta);
        numeroDeContas++;
    }

    public Conta getConta(int id) {
        return contas.get(id);
    }

    public int getNumeroDeContas() {
        return numeroDeContas;
    }

}
