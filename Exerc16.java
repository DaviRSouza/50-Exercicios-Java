package exerc50java;

import java.util.Scanner;

public class Exerc16 {
    public static void main(String[] args){
        System.out.println("16)\tEscreva um programa que gere os primeiros n números da sequência de Fibonacci.");

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe ate que termo a sequencia de fibonnaci deve ir: ");
        int termo = sc.nextInt();
        sc.close();

        int valorAtual = 1;
        int valorAnterior = 0;
        int proximoValor;
        System.out.println("Os primeiros " + termo + " termos da sequência de Fibonacci são:");
        for(int i = 1; i <= termo; i++){
            System.out.print(valorAtual+" ");
            proximoValor = valorAnterior+valorAtual;
            valorAnterior = valorAtual;
            valorAtual = proximoValor;
        }
    }
}
