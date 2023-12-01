package exerc50java;

import java.util.Scanner;

public class Exerc21 {
    public static void main(String[] args){
        System.out.println("Implemente um programa que determine se um número é positivo, negativo ou zero. ");

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número: ");
        double numero = sc.nextDouble();
        sc.close();

        System.out.println(numero > 0 ? "O número inserido é positivo." :
                           numero < 0 ? "O número inserido é negativo."
                                      : "O numero inserido é zero");
    }
}
