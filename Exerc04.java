package exerc50java;
import java.util.Scanner;
public class Exerc04 {
    public static void main(String[] args){
        System.out.println("4)\tEscreva um programa que inverta uma string.");
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase para inverter: ");
        String original = sc.next();
        sc.close();

        String invertida = inverter(original);

        System.out.println("String original: " + original);
        System.out.println("String invertida: " + invertida);
    }

    public static String inverter(String original) {
        StringBuilder reversed = new StringBuilder();

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed.append(original.charAt(i));
        }
        return reversed.toString();
    }
}
