package exerc50java;

import java.util.Arrays;
import java.util.Scanner;

public class Exerc18 {
    public static void main(String[] args){

        System.out.println("Desenvolva um programa que verifique se uma palavra é um anagrama de outra. ");
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a primeira palavra: ");
        String palavra1 = sc.next();

        System.out.print("Informe a segunda palavra: ");
        String palavra2 = sc.next();
        sc.close();

        boolean verificacao = verificarAnagrama(palavra1, palavra2);

        System.out.println(verificacao ? "As palavras "+palavra1+" e "+palavra2+" São anagramas"
                                       : "As palavras "+palavra1+" e "+palavra2+" Não são anagramas");
    }
    static boolean verificarAnagrama(String palavra1, String palavra2) {

        palavra1 = palavra1.replaceAll("\\s", "").toLowerCase();
        palavra2 = palavra2.replaceAll("\\s", "").toLowerCase();
        if (palavra1.length() != palavra2.length()) { return false; }
        char[] arr1 = palavra1.toCharArray();
        char[] arr2 = palavra2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

}
