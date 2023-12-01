package exerc50java;

import java.util.Scanner;

public class Exerc30 {
    public static void main(String[] args) {
        System.out.println("30)	Desenvolva um programa que remova os espaços em branco de uma string.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();
        sc.close();

        String fraseSemEspacos = removerEspacos(frase);

        System.out.println("Frase sem espaços: " + fraseSemEspacos);
    }

    static String removerEspacos(String frase){
        return frase.replaceAll("\\s", "");
    }
}
