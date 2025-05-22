package model.animais;

public class Aranha extends Animal{

    public Aranha(String nome){
        super(nome, 8);
    }

    public void comer() {
        System.out.println(nome + " esta comendo insetos.");
    }
}
