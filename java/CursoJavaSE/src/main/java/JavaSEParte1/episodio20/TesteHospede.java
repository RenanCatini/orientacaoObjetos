package JavaSEParte1.episodio20;

public class TesteHospede {

    public static void main(String[] args) {

        Hospede claudia = criarHospede("Claudia", "Catini");
        exibirDados(claudia);

        Hospede fernando = criarHospede("Fernando", "Amaral");
        exibirDados(fernando);

        Hospede larissa = criarHospede("Larissa", "Amaral");
        exibirDados(larissa);

        Hospede renan = criarHospede("Renan", "Catini");
        exibirDados(renan);

        Hospede gabriel = criarHospede("Gabriel", "Olivares");
        exibirDados(gabriel);

        Hospede raquel = criarHospede("Raquel", "Catini");
        exibirDados(raquel);

        Hospede igor = criarHospede("Igor", "Olivares");
        exibirDados(igor);

    }

    public static Hospede criarHospede(String nome, String sobrenome) {
        return new Hospede(nome, sobrenome);
    }

    public static void exibirDados(Hospede h) {
        System.out.println("Nome...: " + h.getNome());
        System.out.println("Sobrenome...: " + h.getSobrenome());
    }

}