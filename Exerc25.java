package exerc50java;

import java.util.Scanner;

public class Exerc25 {
    public static void main(String[] args) {
        System.out.println("25)\tImplemente um algoritmo de pesquisa linear.");

        Scanner sc = new Scanner(System.in);
        int[] array = { 12, 45, 67, 23, 56, 89, 34 };

        System.out.println("Digite o valor a ser pesquisado: ");
        int valor = sc.nextInt();
        sc.close();

        int posicao = pesquisaLinear(array, valor);
        System.out.println(posicao != -1 ? "O valor '" + valor + "' foi encontrado na posição " + posicao +" do array."
                                         : "O valor '" + valor + "' não foi encontrado no array");
    }

    static int pesquisaLinear(int[] arr, int valor){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == valor){
                return i;
            }
        }
        return - 1;
    }
}
