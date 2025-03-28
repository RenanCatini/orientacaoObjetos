package episodio15;

public class  Hospede {
     String nome;  //Campo, variavel
     String sobrenome;
     double salario;

    // Construtor padrão
    public Hospede() {
    }

    public Hospede(String nome) {
        this.nome = nome;
    }

    public Hospede(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
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

    /**
     * Este método é crucial para a estabilidade da classe Hospede.
     * Caso queira entender com maiores detalhes sua lógica de implementação
     * consulte o documento de espedificação de requisitos do sistema.
     * @param numeroGrande número de acordo com a especificação IEEE para números flutuantes
     * @deprecated favor utilizar esse método somente em ultima instancia
     * prefira o método metodoMuitoComplexoAtualizado
     *
     */
    public void metodoMuitoComplexo(double numeroGrande) {
        //Date hoje = new Date();

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
