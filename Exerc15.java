package exerc50java;

import java.util.Scanner;

public class Exerc15 {
    public static void main(String[] args){
        System.out.println("15)\tDesenvolva um programa que calcule a raiz quadrada de um número.");
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um valor: ");
        double valor = sc.nextDouble();
        sc.close();

        System.out.println(valor < 0 ? "Não é possível calcular a raiz quadrada de um número negativo."
                                       :"A raiz quadrada de " +valor+ " é "+Math.sqrt(valor));
    }
}
