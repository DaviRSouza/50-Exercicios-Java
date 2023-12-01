package exerc50java;

import java.util.Scanner;

public class Exerc23 {
    public static void main(String[] args) {
        System.out.println("Crie um programa que calcule o quadrado de cada elemento em um array. ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o tamanho do array: ");
        int tamanho = sc.nextInt();

        int[] array = new int[tamanho];

        System.out.println("Digite os elementos do array: ");
        for (int i = 0; i < array.length; i++){
            System.out.println("Elemento: " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        sc.close();
        calcularQuadrado(array);

        System.out.println("Array com quadrados dos elementos:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(array[i] + " ");
        }
    }

    static void calcularQuadrado(int[] array){
        for (int i = 0; i < array.length; i++){
            array[i] = array[i] * array[i];
        }
    }
}
