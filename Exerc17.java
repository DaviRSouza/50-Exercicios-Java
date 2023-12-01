package exerc50java;

import java.util.Scanner;

public class Exerc17 {

    public static void main(String[] args) {
        System.out.println("Implemente um programa que calcule o MMC (mínimo múltiplo comum) de dois números. ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro numero: ");
        int valor1 = sc.nextInt();

        System.out.println("Informe o segundo numero: ");
        int valor2 = sc.nextInt();

        int maiorValor = Math.max(valor1, valor2);
        int mmc = 0;

        for (int i = maiorValor; ; i += maiorValor) {
            if (i % valor1 == 0 && i % valor2 == 0) {
                mmc = i;
                break;
            }
        }
        System.out.println("O MMC de " + valor1 + " e " + valor2 + " = " + mmc);
    }
}
