package exerc50java;

import java.util.Scanner;

public class Exerc22 {
    public static void main(String[] args){
        System.out.println("Desenvolva um programa que encontre os números primos em um intervalo específico. ");
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor inicial do intervalo: ");
        int inicio = sc.nextInt();

        System.out.print("Digite o valor final do intervalo: ");
        int fim = sc.nextInt();
        sc.close();

        System.out.println("Números primos no intervalo de " + inicio + " a " + fim + ":");
        numPrimosIntervalo(inicio, fim);
    }

    static boolean isPrimo(int numero){
        if (numero <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++){
            if (numero % i == 0){
                return false;
            }
        }
        return true;
    }

    static void numPrimosIntervalo(int inicio, int fim){
        for (int i = inicio; i <= fim; i++){
            if (isPrimo(i)){
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }
}

