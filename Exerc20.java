package exerc50java;

import java.util.Scanner;

public class Exerc20 {
    public static void main(String[] args){
        System.out.println("Escreva um programa que conte o número de ocorrências de uma palavra em uma frase. ");
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a frase: ");
        String frase = sc.nextLine();

        System.out.print("Insira a palavra a ser contada: ");
        String palavra = sc.next();
        sc.close();

        String[] palavrasNaFrase = frase.split(" ");

        int contador = 0;

        for (String palavraNaFrase : palavrasNaFrase) {
            palavraNaFrase = palavraNaFrase.replaceAll("[^a-zA-Z]", "");

            if (palavraNaFrase.equalsIgnoreCase(palavra)) {
                contador++;
            }
        }

        System.out.println("A palavra '" + palavra + "' ocorre " + contador + " vezes na frase.");

    }
}
