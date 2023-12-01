package exerc50java;

import java.util.Scanner;

public class Exerc43 {
    public static void main(String[] args) {
        System.out.println("Crie um programa que valide se um número é um quadrado perfeito.");
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        System.out.println(quadradoPerfeito(numero) ? numero + " é um quadrado perfeito."
                                                    : numero + " não é um quadrado perfeito.");
    }

    static boolean quadradoPerfeito(int numero){
        if (numero < 0){ return false; }

        int raizQuadrada = (int) Math.sqrt(numero);
        return raizQuadrada * raizQuadrada == numero;
    }
}
