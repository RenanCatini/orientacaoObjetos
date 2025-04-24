package JavaSEParte1.episodio27;

public class TestePassagemValores {
    public static void main(String[] args) {
        Data hoje;
        int valor;
        TestePassagemValores t = new TestePassagemValores();

        // Atribuir um int
        valor = 12;

        // Vamos altera-lo

        t.alterarInt (valor);

        System.out.println("O valor original 12, foi alterado?");
        System.out.println(valor);

        //Atribuir uma data
        hoje = new Data(3,4,2025);
        //vamos tentar muda-lo

        t.alterarAtributoObjeto(hoje);
        System.out.println("O dia original 3, foi alterado?");
        System.out.println(hoje.getDia());

        t.alterarReferenciaObjeto(hoje);
        System.out.println("O dia original 3, foi alterado?");
        System.out.println(hoje.getDia());

    }

    // metodo que altera o valor do tipo int
    public void alterarInt(int valor) { // provado que a passagem foi feita por valor
        valor = 78;
    }

    public void alterarAtributoObjeto(Data ref) { // isso não é passar por referencia? NAOO
        ref.setDia(15);
    }

    public void alterarReferenciaObjeto(Data d) {
        d = new Data(30, 11, 1970);
    }

}
