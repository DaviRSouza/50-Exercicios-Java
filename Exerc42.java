package exerc50java;

import java.util.Scanner;

public class Exerc42 {
    public static void main(String[] args) {
        System.out.println("Desenvolva um programa que calcule a hipotenusa de um triângulo retângulo.");
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o comprimento do primeiro cateto: ");
        double cateto1 = sc.nextDouble();
        System.out.print("Digite o comprimento do segundo cateto: ");
        double cateto2 = sc.nextDouble();
        double hipotenusa = calcularHipotenusa(cateto1, cateto2);

        System.out.println("A hipotenusa do triângulo retângulo é: " + hipotenusa);
    }

    static double calcularHipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
    }

}
