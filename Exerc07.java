package exerc50java;
import java.util.Scanner;

public class Exerc07 {
    public static void main(String[] args){
        System.out.println("7)\tDesenvolva um programa que calcule o fatorial de um número.");
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o numero que deseja ver o fatorial: ");
        int fatorial = sc.nextInt();
        int somaFatorial = 1;

        for(int i = fatorial; i > 0; i--){
            somaFatorial *= i;
        }
        System.out.println(fatorial+"! = "+somaFatorial);
    }
}
