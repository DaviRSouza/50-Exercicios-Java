package exerc50java;

import java.util.Scanner;

public class Exerc09 {
    public static void main(String[] args){
        System.out.println("9)\tCrie um programa que calcule a média de um array de números.");

        int[] arrayNumeros = new int[4];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i <= arrayNumeros.length -1; i++){
            System.out.print("Digite o "+(i+1)+"º numero: ");
            arrayNumeros[i] = sc.nextInt();
        }
        sc.close();
        verificacao(arrayNumeros);
    }
    public static void verificacao(int[] arrayNumeros) {
        int media = 0;
        for (int i = 0; i <= arrayNumeros.length -1; i++) {
            media += arrayNumeros[i];
        }
        System.out.println("A media é: "+media/4);
    }
}
