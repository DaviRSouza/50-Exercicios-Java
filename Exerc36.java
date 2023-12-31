package exerc50java;

import java.util.Scanner;

public class Exerc36 {
    public static void main(String[] args) {
        System.out.println("36)	Escreva um programa que verifique se uma matriz é diagonal.");
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de linhas da matriz: ");
        int linhas = sc.nextInt();

        System.out.print("Digite o número de colunas da matriz: ");
        int colunas = sc.nextInt();

        int[][] matriz = new int[linhas][colunas];

        System.out.println("Digite os elementos da matriz:");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println( verificaMatrizDiagonal(matriz) ? "A matriz é diagonal."
                                                           : "A matriz não é diagonal.");
    }

    public static boolean verificaMatrizDiagonal(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (i != j && matriz[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
    }
}
