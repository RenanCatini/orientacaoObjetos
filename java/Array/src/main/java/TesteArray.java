import java.util.Arrays;

public class TesteArray {
    // int [] array2 = new int[];


    public static void exibirArray(int[] array) {
        System.out.print("<");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]);
            if(i+1 < array.length) {
                System.out.print(", ");
            }
        }
        System.out.print(">");
    }

    public static void main(String[] args) {
        int [] array1 = {2,3,5,7,9,11,13,19};

        System.out.println("\nImprimindo o array1");
        exibirArray(array1);

        int [] array2 = array1;
        array2[0] = 0;
        array2[2] = 2;

        System.out.println("\nImprimindo o array1");
        exibirArray(array1);

        // Ao alterar o valor de array2 que é um ponteiro de array1, ele altera os valores de array1

        // Criar array de 5 arrays
        int[][] matriz = new int[5][];

        // Atribuir o valor i*j a cada posição
        for (int i = 0; i < matriz.length; i++) {
            // Criar o tamanho de cada vetor e atribuir o valor
            matriz[i] = new int[i];

            // Enquanto j < tamanho do vetor criado acima = i*j
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i*j;
            }
        }

        System.out.println("\nExibir matriz");
        for(int i = 0; i < matriz.length ; i++){
            exibirArray(matriz[i]);
            System.out.println("");
        }

        System.out.println("Imprimindo array1, array2 e matriz usando os as funções ja existentes" +
                "no JSE na classe Arrays: ");

        // Arrays.toString(array); = retorna os valores do array em String
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        // Arrays.deepToString(matriz); = retorna os valores da matriz em vetor String
        System.out.println(Arrays.deepToString(matriz));



    }

}
