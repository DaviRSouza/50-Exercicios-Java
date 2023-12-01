package exerc50java;

import java.util.Scanner;

public class Exerc19 {
    public static void main(String[] args){
        System.out.println("Crie um programa que calcule a área de um círculo. ");
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o raio do círculo: ");
        double raio = sc.nextDouble();
        sc.close();
        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("A área do círculo com raio " + raio + " é: " + area);
    }
}
