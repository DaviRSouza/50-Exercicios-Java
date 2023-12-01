package exerc50java;

import java.util.Random;
import java.util.Scanner;

public class Exerc13 {
    public static void main(String[] args){
        System.out.println("13)\tImplemente um jogo de adivinhação simples.");
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int numeroCorreto = rd.nextInt(100);
        int tentativas = 0;
        int palpite;

        System.out.println("Bem vindo ao jogo de adivinhação!!");
        System.out.println("Você tera que adivinhar um numero entre 1 a 100, preparado? ");
        do {
            System.out.println("De um palpite: ");
            palpite = sc.nextInt();
            tentativas++;

            String mensagem =   palpite > numeroCorreto ? "Tente um numero menor."
                              : palpite < numeroCorreto ? "Tente um numero maior"
                              : "Parabens! o numero correto é " + numeroCorreto + " Você acertou em "+ tentativas + " Tentativas!";
            System.out.println(mensagem);

        } while (palpite != numeroCorreto);
        sc.close();
    }
}
