package encapsulamento.versao1;

public class Veiculo {
    double carga;
    double cargaMaxima;

    public Veiculo(double cargaMaxima){
        this.cargaMaxima = cargaMaxima;
        this.carga = 0;
    }

    public double getCarga() {
        return carga;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }
}
