package exerc50java;

import java.util.Scanner;

public class Exerc12 {
    public static void main(String[] args){
        System.out.println("12)\tEscreva um programa que encontre o menor elemento em um array.");
        int[] array = new int[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array.length; i++){
            System.out.print("Digite o "+(i+1)+"º numero: ");
            array[i] = sc.nextInt();
        }
        int resultado = encontraMenorNumero(array);

        System.out.println("O menor dentro do array é: "+ resultado);
    }

    public static int encontraMenorNumero(int[] array){
        int menorNumero = array[0];
        for(int i = 0; i < array.length; i++){
            //menorNumero = array[i] < menorNumero ? array[i] : menorNumero;
            menorNumero = Math.min(menorNumero ,array[i]);
        }
        return menorNumero;
    }
}
