package exerc50java;
import java.util.Scanner;

public class Exerc05 {
    public static void main(String[] args){
        System.out.println("5)\tCrie um programa que encontre o maior elemento em um array.");
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        int maior = Integer.MIN_VALUE;;

        for(int i = 0; i <= array.length; i++) {
            System.out.println("Informe um numero");
            array[1] = sc.nextInt();
            maior = Math.max(maior, array[1]);
        }
        sc.close();
        /*
            for(int i = 0; i <= array.length; i++) {
                maior = Math.max(maior, array[1]);
            }
        */
        System.out.println("O maior numero digitado é " + maior);
    }
}