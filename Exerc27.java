package exerc50java;

import java.util.Scanner;

public class Exerc27 {
    public static void main(String[] args) {
        System.out.println("28)\tEscreva um programa que gere todos os números primos até um determinado número.");
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

        System.out.println(verificarSimetria(matriz) ? "A matriz é simétrica."
                                                     : "A matriz não é simétrica.");
    }

    public static boolean verificarSimetria(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        if (linhas != colunas) { return false; }

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
