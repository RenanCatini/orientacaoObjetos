package JavaSEParte1.episodio5;

public class Hospede {
     private String nome;  //Campo, variavel
     private String sobrenome;


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

    /*
     * As vezes o metodo main aparece para teste
     * Isso se chama Boot-strap: na propria classe instanciar o objeto para execução
     */
    public static void main(String[] args) {
        Hospede renan = new Hospede();  //Classe <nome> = new Classe();
        renan.setNome("Renan");
        renan.setSobrenome("Catini Amaral");

        // exibindo o estado do objeto
        System.out.println("Nome...: " + renan.getNome());
        System.out.println("Sobrenome...: " + renan.getSobrenome());
    }
}
