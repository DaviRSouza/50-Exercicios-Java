package exerc50java;

import java.util.Scanner;

public class Exerc37 {
    public static void main(String[] args) {
        System.out.println("Implemente um programa que calcule a média ponderada de um conjunto de notas.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas notas você deseja inserir? ");
        int quantidadeNotas = sc.nextInt();

        double somaNotas = 0;
        double somaPesos = 0;

        for (int i = 1; i <= quantidadeNotas; i++) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = sc.nextDouble();

            System.out.print("Digite o peso da nota " + i + ": ");
            double peso = sc.nextDouble();

            somaNotas += nota * peso;
            somaPesos += peso;
        }
        String mensagem = somaPesos > 0 ? "A média ponderada é: " + (somaNotas / somaPesos)
                                        : "Não foi possível calcular a média ponderada. Divisão por zero.";
        System.out.println(mensagem);
    }
}
