package model.animais;

public class Animal {
    protected String nome;
    protected int numeroDePernas;

    protected Animal(String nome, int numeroDePernas){
        this.nome = nome;
        this.numeroDePernas = numeroDePernas;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroDePernas() {
        return this.numeroDePernas;
    }

    public void setNumeroDePernas(int numeroDePernas) {
        this.numeroDePernas = numeroDePernas;
    }

    public void caminhar() {
        System.out.println(nome + " anda com " + numeroDePernas + " número de pernas.");
    }

    public void comer() {
        System.out.println(nome + " come.");
    }
}
