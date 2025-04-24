package episodio19;

public class TesteAtribuicaoReferencias {
    public static void main(String[] args) {
        Hospede h1 = new Hospede("Renan", "Catini");
        Hospede h2 = new Hospede("Renan", "Catini");
        System.out.println("Exibindo os dados antes da alteração");
        System.out.println("Hospede h1...: " + h1.getNome() + " " + h1.getSobrenome());

        System.out.println("Exibindo os dados antes da alteração");
        System.out.println("Hospede h2...: " + h2.getNome() + " " + h2.getSobrenome());

        h1.setNome("Larissa");
        h1.setSobrenome("Amaral");

        System.out.println("");

        System.out.println("Exibindo os dados antes da alteração");
        System.out.println("Hospede h1...: " + h1.getNome() + " " + h1.getSobrenome());

        System.out.println("Exibindo os dados antes da alteração");
        System.out.println("Hospede h2...: " + h2.getNome() + " " + h2.getSobrenome());

        mudaHospede(h1);
        System.out.println(h1.getNome());   //Claudia
    }

    static void mudaHospede(Hospede h2) {
        h2.setNome("Claudia");
    }

}
