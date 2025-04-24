package JavaSEParte1.episodio24;

public class  Hospede {
     private String nome;
     private String sobrenome;
     private double salario;
     private Endereco endereco;
     private boolean fumante;

    public Hospede() {
        this("");
    }

    public Hospede(String nome) {
        this(nome, "");
    }

    public Hospede(String nome, String sobrenome) {
        this(nome, sobrenome, null);
    }

    public Hospede(String nome, String sobrenome, Endereco endereco) {
        this(nome, sobrenome, 0.0, endereco);
    }


    public Hospede(String nome, String sobrenome, double salario, Endereco endereco) {
        this(nome, sobrenome, salario, endereco, true);
    }

    public Hospede(String nome, String sobrenome, double salario, Endereco endereco, boolean fumante) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
        this.endereco = endereco;
        this.fumante = true;
    }



    public boolean isFumante() {
        return fumante;
    }

    public void setFumante(boolean fumante) {
        this.fumante = fumante;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
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

}
