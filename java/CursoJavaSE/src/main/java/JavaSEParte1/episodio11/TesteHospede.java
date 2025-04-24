package episodio11;

/*
* Mostrar para o compilador onde a variavel Date esta
* O asterisco vai indicar que ele vai importar todas as variaveis necessarias
*/

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
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

        Hospede larissa = new Hospede("Larissa");
        larissa.setSobrenome("Catini Amaral");

        System.out.println("Nome...: " + larissa.getNome());
        System.out.println("Sobrenome...: " + larissa.getSobrenome());

        Hospede gabriel = new Hospede("Gabriel", "Catini Olivares");

        System.out.println("Nome...: " + gabriel.getNome());
        System.out.println("Sobrenome...: " + gabriel.getSobrenome());


        Hospede raquel = new Hospede("Raquel", "Helena Catini");
        // Exibindo o estado do objeto
        String nomeRetornado = raquel.getNome();
        String sobrenomeRetornado = raquel.getSobrenome();
        System.out.println("Nome...: " + nomeRetornado);
        System.out.println("Sobrenome...: " + sobrenomeRetornado);



    }

}
