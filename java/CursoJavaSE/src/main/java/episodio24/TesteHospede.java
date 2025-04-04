package episodio24;

public class TesteHospede {

    public static void main(String[] args) {

        Endereco end1 = new Endereco("Rua Raimundo Correa", 394, "Segundo andar");

        Hospede renan = criarHospede("Renan", "Catini Amaral", null);
        renan.setEndereco(end1);
        exibirDados(renan);

        Endereco end2 = new Endereco("Rua Santa Maria", 54, "");

        Hospede fernando = criarHospede("Fernando", "Amaral", end2);
        exibirDados(fernando);
//
//        Hospede larissa = criarHospede("Larissa", "Amaral");
//        exibirDados(larissa);
//
//        Hospede claudia = criarHospede("Claudia", "Catini");
//        exibirDados(claudia);
//
//        Hospede gabriel = criarHospede("Gabriel", "Olivares");
//        exibirDados(gabriel);
//
//        Hospede raquel = criarHospede("Raquel", "Catini");
//        exibirDados(raquel);
//
//        Hospede igor = criarHospede("Igor", "Olivares");
//        exibirDados(igor);

    }

    public static Hospede criarHospede(String nome, String sobrenome, Endereco e) {
        if(e == null) {
            return new Hospede(nome, sobrenome);
        } else {
            return new Hospede(nome, sobrenome, e);
        }
    }

    public static void exibirDados(Hospede h) {
        System.out.println("Nome...: " + h.getNome());
        System.out.println("Sobrenome...: " + h.getSobrenome());
        System.out.println("Endereço...: " + h.getEndereco().getRua());
    }

}