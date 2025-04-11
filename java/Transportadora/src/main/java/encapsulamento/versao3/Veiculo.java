package encapsulamento.versao3;

public class Veiculo {
    // Armazena em newtons
    private double carga;
    private double cargaMaxima;

    public Veiculo(double cargaMaxima) {
        this.cargaMaxima = quilosParaNewtons(cargaMaxima);
        this.carga = 0;
    }

    public double getCarga() {
        return newtonsParaQuilos(carga);
    }

    public double getCargaMaxima() {
        return newtonsParaQuilos(cargaMaxima);
    }

    public boolean adicionarCaixa(double peso) {
        if(this.carga + quilosParaNewtons(peso) <= this.cargaMaxima) {
            this.carga += quilosParaNewtons(peso);
            return true;
        }
        return false;
    }

    // 1 Newton == 9.8Kg

    private double newtonsParaQuilos(double peso) {
        return peso * 9.8;
    }

    private double quilosParaNewtons(double peso) {
        return peso / 9.8;
    }

}