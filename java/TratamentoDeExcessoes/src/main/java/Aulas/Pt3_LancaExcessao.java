package Aulas;

public class Pt3_LancaExcessao {

    public static void main(String[] args) {
        Pt3_LancaExcessao lanca = new Pt3_LancaExcessao();
        lanca.verificaLancamento(8);
    }

    public void verificaLancamento(int valor) {
        try {
            if (valor >= 10) {
                System.out.println("OK. Valor válido");
            } else {
                System.out.println("Erro. Valor inválido");
                // Lançar uma excessão do tipo Exception
                throw new Exception("Exceção por valor inválido");
            }
        } catch (Exception exc){
            System.out.println(exc.getMessage());
            System.out.println("Excessão capturada");
        }



    }
}
