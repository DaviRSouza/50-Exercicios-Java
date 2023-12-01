package exerc50java;

import java.util.Scanner;

public class Exerc31 {
    public static void main(String[] args) {
        System.out.println("31)	Crie um programa que conte o número de caracteres em uma string.");
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um frase: ");
        String frase = sc.nextLine();
        sc.close();

        int caracteres = contarCaracter(frase);

        System.out.println("Número de caracteres na frase é de: " + caracteres);
    }

    static int contarCaracter(String frase) {
        return frase.length();
    }
}
