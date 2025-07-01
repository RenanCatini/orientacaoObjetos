package Aulas;

import java.io.FileNotFoundException;

public class Pt4_DeclaracaoExcessao {
    public static void main(String[] args) {
        Pt4_DeclaracaoExcessao declaracao = new Pt4_DeclaracaoExcessao();
        declaracao.executa();
    }

    public void executa() {
        String nome = "";
        // Tratamento da excessão não verificada
        try {
            abreArquivo(nome);
        } catch (FileNotFoundException exc) {
            System.out.println(exc.getMessage());
        }
    }

    /*
     - Toda vez que chamar um método que retorna uma excessao diferente de runtime,
     tem que tratar no método onde foi chamada, ou relançar ela.
    */

    public void abreArquivo(String nome) throws FileNotFoundException{
        if((nome == null) || nome.equals("")) {
            throw new FileNotFoundException("Nome inválido");
        } else {
            System.out.println("O arquivo está aberto");
        }
    }
}
