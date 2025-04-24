package JavaArrays;

public class ArrayTester {

    public static void main(String[] args) {

        /* ------------ VETORES ------------ */
        System.out.println("- Vetores: ");

        // Números __________________________________
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print(numbers[i] + " ");
        }

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        // Strings _____________________________________
        String[] names = new String[3];

        System.out.println();
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]);
        }

        names[0] = "Renan";
        names[1] = "Larissa";
        names[2] = "Gabriel";

        System.out.println();
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }

        // Outra forma _____________________________________
        String[] weekend = {"Saturday", "Sunday"};

        System.out.println();
        for (int i = 0; i < weekend.length; i++) {
            System.out.print(weekend[i] + " ");
        }

        
        /* ------------ MATRIZES ------------ */
        System.out.println("\n\n- Matrizes: ");

        /*
            - Matriz não retangular:

            int [][] twoDimensions = new int[2][];
            twoDimensions[0] = new int[2];
            twoDimensions[1] = new int[5];

            - Erro: int [][] twoDimensions = new int[][2];
        */

        //int[][] twoDimensions = new int[2][2];

        int [][] twoDimensions = new int[2][];
        twoDimensions[0] = new int[2];
        twoDimensions[1] = new int[5];

        System.out.println(twoDimensions[0].length + " " + twoDimensions[1].length);

        for (int i = 0; i < twoDimensions.length; i++) {
            for (int j = 0; j < twoDimensions[i].length; j++) {
                twoDimensions[i][j] = (int)(Math.random()*10);
                System.out.print(twoDimensions[i][j] + " ");
            }
            System.out.println();
        }


        /* ------------ Loops Aprimorados ------------ */
        System.out.println("\n\n- Loops aprimorados: ");
        // Usamos o vetor numbers

        // Para cada x dentro de numbers ( x == numbers[i])
        for(int x: numbers) {   // For each
            System.out.print(x + " ");
        }

        /* ------------ Classe Arrays ------------ */
        System.out.println("\n\n- Classe Arrays: ");


    }

}
