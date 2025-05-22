package model.animais;

public class Peixe extends Animal implements AnimalDeEstimacao{

    public Peixe(String nome) {
        super(nome, 0);
    }

    public void brincar() {
        System.out.println(nome + " brinca na água.");
    }

    public void caminhar() {
        System.out.println(nome + " não anda, nada.");
    }

    public void comer() {
        System.out.println(nome + " esta comendo algas.");
    }

}
