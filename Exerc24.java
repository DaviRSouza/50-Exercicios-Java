package exerc50java;

import java.util.Scanner;

public class Exerc24 {
    public static void main(String[] args) {
        System.out.println("Escreva um programa que inverta a ordem das palavras em uma frase. ");

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();
        sc.close();

        String fraseInvertida = inverterOrdemPalavras(frase);

        System.out.println("Frase com as palavras invertidas: ");
        System.out.println(fraseInvertida);

    }

    static String inverterOrdemPalavras(String frase) {
        String[] palavras = frase.split("\\s+");

        StringBuilder fraseInvertida = new StringBuilder();

        for (int i = palavras.length - 1; i >= 0; i--) {
            fraseInvertida.append(palavras[i]).append(" ");
        }

        return fraseInvertida.toString().trim();
    }
}
