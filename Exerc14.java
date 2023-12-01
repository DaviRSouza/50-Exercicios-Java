package exerc50java;

import java.util.Scanner;

public class Exerc14 {
    public static void main(String[] args){
        System.out.println("14)\tCrie um programa que conte o número de vogais em uma string.");
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra ou uma frase: ");
        String palavra = sc.next();

        verificaString(palavra);
    }

    public static void verificaString(String palavra){
        int contadorVogal = 0;
        for (int i = 0; i < palavra.length(); i++){
            char letra = palavra.charAt(i);
            boolean vogal = (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') ||
                            (letra == 'A' ||  letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U');
            contadorVogal += vogal ? 1 : 0;
        }
        System.out.println("O total de vogais na palavra '" +palavra+ "' é "+ contadorVogal);
    }
}
