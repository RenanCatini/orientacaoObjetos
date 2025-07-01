package Aulas;

public class Pt2_Hierarquia {
    private int[] array = {0,1,2,3,4};
    private String string = "Java";

    public static void main(String[] args) {
        Pt2_Hierarquia hierarquia = new Pt2_Hierarquia();
        hierarquia.acessaArrayString();
    }

    public void acessaArrayString() {
        int elemento;
        char caracter;

        try {
            elemento = array[5]; // Lanca ArrayIndexOutOfBoundsException pois acessa uma posição inválida
            caracter = string.charAt(5); // Lanca ArrayIndexOutOfBoundsException pois acessa uma posição inválida
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            exc.printStackTrace();
            System.out.println(exc.getMessage() );
            System.out.println("Excessão no método acessaArray");
        }
        catch (IndexOutOfBoundsException exc) {
            System.out.println("Excessão no método acessaString");
        }
    }

}
