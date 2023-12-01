package exerc50java;

import java.util.Scanner;

public class Exerc40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = sc.nextInt();

        System.out.println(AnoBissexto(ano) ? ano + " é um ano bissexto."
                                            : ano + " não é um ano bissexto.");
    }

    static boolean AnoBissexto(int ano) {
        boolean bissexto = false;
        if (ano % 4 == 0) {
            if (ano % 100 == 0) {
                if (ano % 400 == 0) {
                    bissexto = true;
                }
            } else {
                bissexto = true;
            }
        }
        return bissexto;
    }
}
