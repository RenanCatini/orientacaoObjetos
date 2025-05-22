package model.animais;

public class Gato extends Animal implements AnimalDeEstimacao{
    public Gato(String nome) {
        super(nome, 4);
    }

    public Gato() {
        super("", 4);
    }

    public void brincar() {
        System.out.println(nome + " brinca com bola de pelo.");
    }

    public void comer() {
        System.out.println(nome + " está comendo ração.");
    }

}
