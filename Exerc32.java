package exerc50java;

import java.util.Scanner;

public class Exerc32 {
    public static void main(String[] args) {
        System.out.println("32)	Escreva um programa que verifique se um número é uma potência de 2.");
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número pra saber se é uma potência de 2: ");
        int numero = sc.nextInt();
        sc.close();

        System.out.println( potenciaDeDois(numero) ? numero + " é uma potência de 2."
                                                   : numero + " não é uma potência de 2.");
    }

    static boolean potenciaDeDois(int numero) {
        return (numero > 0) && ((numero & (numero - 1)) == 0);
    }

}
