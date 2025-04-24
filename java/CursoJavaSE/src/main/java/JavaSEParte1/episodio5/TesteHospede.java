package JavaSEParte1.episodio5;

/*
* Mostrar para o compilador onde a variavel Date esta
* O asterisco vai indicar que ele vai importar todas as variaveis necessarias
*/

import java.util.ArrayList;
import java.util.Date;

public class TesteHospede {

    public static void main(String[] args) {
        //Classe <nome> = new Classe();
        Hospede claudia = new Hospede();
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

        Date data = new Date();
        ArrayList lista = new ArrayList();



    }

}
