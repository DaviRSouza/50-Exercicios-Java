package exerc50java;

import java.util.Scanner;

public class Exerc08 {
    public static void main(String[] args){
        System.out.println("8)\tEscreva um programa para verificar se uma string é um palíndromo.");
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe uma palavra para verificarmos se é um palindromo: ");
        String original = sc.nextLine();
        sc.close();
        String invertida = inverter(original);

        System.out.println("Palavra original: "+ original);
        System.out.println("Palavra invertida: "+ invertida);
        System.out.println( original.equalsIgnoreCase(invertida) ? "É um palíndromo" : "Não é um palíndromo");
    }

    public static String inverter(String original) {
        StringBuilder reversed = new StringBuilder();

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed.append(original.charAt(i));
        }
        return reversed.toString();
    }
}
