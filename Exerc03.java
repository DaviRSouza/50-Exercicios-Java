package exerc50java;
import java.util.Scanner;

public class Exerc03 {
    public static void main(String[] args){
        System.out.println("3)\tImplemente um programa que verifique se um número é primo.");
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número para verificar se é primo: ");
        int valor = sc.nextInt();
        sc.close();
        if(valor <= 1) {
            System.out.println("O numero 1 não é primo");
            System.exit(0);
        }
        for (int c = 2; c < valor; c++){
            if(valor % c == 0 ){
                System.out.println("O numero " + valor + " não é primo");
                System.exit(0);
            }
        }
        System.out.println("O numero "+valor+" é primo");
    }
}