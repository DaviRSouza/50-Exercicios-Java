package exerc50java;

import java.util.Scanner;

public class Exerc41 {
    public static void main(String[] args) {
        System.out.println("Implemente um programa que encontre o segundo maior elemento em um array.");
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do array");
        int tamanhoArray = sc.nextInt();

        int[] arr = new int[tamanhoArray];

        System.out.println("Digite os elementos da array: ");

        for (int i = 0; i < tamanhoArray; i++){
            arr[i] = sc.nextInt();
        }

        int segundoMaior = pesqSegundoMaior(arr);

        System.out.println(segundoMaior != Integer.MIN_VALUE ? "O segundo maior elemento é: " + segundoMaior
                                                             : "Não há segundo maior elemento.");
    }

    static int pesqSegundoMaior(int[] arr) {
        int maior = Integer.MIN_VALUE;
        int segundoMaior = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > maior){
                segundoMaior = maior;
                maior = arr[i];
            } else if (arr[i] > segundoMaior && arr[i] != maior) {
                segundoMaior = arr[i];
            }
        }

        return segundoMaior;
    }
}
