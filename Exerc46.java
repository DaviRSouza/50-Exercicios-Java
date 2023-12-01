package exerc50java;

import java.util.Scanner;

public class Exerc46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o ângulo em graus: ");
        double anguloGraus = sc.nextDouble();
        double seno = Math.sin(Math.toRadians(anguloGraus));
        System.out.println("O seno do ângulo é: " + seno);
    }
}
