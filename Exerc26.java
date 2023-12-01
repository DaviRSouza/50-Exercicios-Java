package exerc50java;

import java.util.Scanner;

public class Exerc26 {
    public static void main(String[] args) {
        System.out.println("26)\tDesenvolva um programa que calcule o cosseno de um ângulo em graus.");

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o ângulo em graus: ");
        sc.close();

        double anguloG = sc.nextDouble();
        double anguloR = Math.toRadians(anguloG);
        double cosseno = Math.cos(anguloR);

        System.out.println("O cosseno de " + anguloG + " graus é: " + cosseno);
    }
}
