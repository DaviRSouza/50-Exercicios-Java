package exerc50java;

import java.util.Scanner;

public class Exerc28 {
    public static void main(String[] args) {
        System.out.println("28)	Escreva um programa que gere todos os números primos até um determinado número.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número pra ser gerado números primos até essa quantidade: ");
        sc.close();

        int numero = sc.nextInt();

        for (int i = 2; i <= numero; i++){
            if (primo(i)){ System.out.println(i + " "); }
        }
    }

    static boolean primo(int n){
        if (n <= 1){ return false; }

        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){ return false; }
        }
        return true;
    }
}
