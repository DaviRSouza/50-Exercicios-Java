package exerc50java;
import java.util.Scanner;
public class Exerc39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        int numeroPalavras = contarPalavras(frase);

        System.out.println("O número de palavras na frase é: " + numeroPalavras);
    }

    static int contarPalavras(String frase) {
        if (frase == null || frase.isEmpty()){ return 0; }

        String[] palavras = frase.split("\\s+");
        return palavras.length;
    }
}
