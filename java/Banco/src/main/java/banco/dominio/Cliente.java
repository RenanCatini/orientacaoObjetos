package banco.dominio;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String sobrenome;
    private String cpf;
    private ArrayList<Conta> contas;

    public Cliente(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() { return cpf;}

    public void setCpf(String cpf) {this.cpf = cpf;}

    public Conta getConta(int indice) {
        return contas.get(indice);
    }

    public int getNumeroDeContas() {
        return contas.size();
    }

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }
}
