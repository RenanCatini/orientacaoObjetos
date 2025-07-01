package Aulas;

public class Pt1_TestaExcessao {
    public static void main(String[] args) {
        Pt1_TestaExcessao testa = new Pt1_TestaExcessao();
        testa.realizaOperacao();
    }

    public void realizaOperacao() {
        realizaDivisao();

        // try{
        //     realizaDivisao();
        // } catch (ArithmeticException exc) {
        //     System.out.println("Uma excessão foi lancada!");
        // }
    }

    public void realizaDivisao() {
        int x = 0;
        try {
            x = 10 / 0; // Erro de lógica: Divisão por 0 - ArithmeticException
        } catch (ArithmeticException exc) {
            System.out.println("Uma excessão foi lancada!");
        }
        System.out.println("O valor de x: " + x);
    }

}
