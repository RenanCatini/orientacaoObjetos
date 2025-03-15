package epsodio1;

public class TesteHospede {

    public static void main(String[] args) {
        Hospede claudia = new Hospede();  //Classe <nome> = new Classe();
        claudia.setNome("Claudia");
        claudia.setSobrenome("Cristina Catini");

        // exibindo o estado do objeto
        System.out.println("Nome...: " + claudia.getNome());
        System.out.println("Sobrenome...: " + claudia.getSobrenome());


        Hospede fernando = new Hospede();
        fernando.setNome("Luiz Fernando");
        fernando.setSobrenome(" Amaral");

        // exibindo o estado do objeto
        System.out.println("Nome...: " + fernando.getNome());
        System.out.println("Sobrenome...: " + fernando.getSobrenome());
    }

}
