package exerc50java;

import java.util.Scanner;

public class Exerc33 {
    public static void main(String[] args) {
        System.out.println("33)	Implemente um programa que calcule o máximo divisor comum (MDC) de dois números.");
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numeroUm = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int numeroDois = sc.nextInt();

        int mdc = calcularMDC(numeroUm, numeroDois);

        System.out.println("O MDC de " + numeroUm + " e " + numeroDois + " é: " + mdc);

        sc.close();
    }
    static int calcularMDC(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
