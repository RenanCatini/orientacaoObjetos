package model.animais;

public class TesteAnimais {

    public static void main(String[] args) {

        Peixe p = new Peixe("Nemo");
        Gato g = new Gato("Tom");
        Animal a = new Peixe("Peixoto");
        Animal ab = new Aranha("Aracnidea");
        AnimalDeEstimacao ae = new Gato("Pudim");

        System.out.println("O peixe " + p.nome + " possui " + p.numeroDePernas + " número de pernas");
        p.caminhar();
        p.brincar();
        p.comer();

        System.out.println();

        System.out.println("O gato " + g.nome + " possui " + g.numeroDePernas + " número de pernas");
        g.caminhar();
        g.brincar();
        g.comer();

        System.out.println();

        System.out.println("O peixe " + a.nome + " possui " + a.numeroDePernas + " número de pernas");
        a.caminhar();
        ((Peixe) a).brincar();
        a.comer();

        System.out.println();

        System.out.println("A aranha " + ab.nome + " possui " + ab.numeroDePernas + " número de pernas");
        ab.caminhar();
        ab.comer();

        System.out.println();

        System.out.println("O gato " + ((Gato) ae).nome + " possui " + ((Gato) ae).numeroDePernas + " número de pernas");
        ((Gato) ae).caminhar();
        ae.brincar();
        ((Gato) ae).comer();

    }

}
