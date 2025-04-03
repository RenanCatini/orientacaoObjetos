import org.example.wrapper.classes.Guest;

public class Main {
    public static void main(String[] args) {

        /*
            A variavel xyz é um ponteiro para alterar os valores de Guest na Heap
         */
        Guest xyz = new Guest();
        xyz.setTitle("Mister");

        String resposta = xyz.getTitle();
        System.out.println(resposta);

        xyz.setFirstName("Renan");
        System.out.println(xyz.getFirstName());

    }
}





