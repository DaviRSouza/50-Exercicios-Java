package exerc50java;

import java.util.Scanner;

public class Exerc44 {
    public static void main(String[] args) {
        System.out.println("Escreva um programa que gere um triângulo de Pascal.");
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de linhas para Triângulo de Pascal: ");
        int linhas = sc.nextInt();

        exibirTriangulo(linhas);
    }
    static void exibirTriangulo(int linhas){
        for (int i = 0; i <= linhas; i++){
            int numero = 1;
            for (int j = 0; j <= i; j++){
                System.out.println(numero + " ");
                numero = numero * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
