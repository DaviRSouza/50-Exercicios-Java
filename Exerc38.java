package exerc50java;
import java.util.*;

public class Exerc38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números você deseja inserir? ");
        int quantidadeNumeros = sc.nextInt();

        List<Integer> numeros = new ArrayList<>();

        System.out.println("Digite os números:");

        for (int i = 0; i < quantidadeNumeros; i++) {
            numeros.add(sc.nextInt());
        }

        int moda = encontrarModa(numeros);

        System.out.println(moda != Integer.MIN_VALUE ? "A moda dos números é: " + moda
                                                     : "Não há moda. Todos os números têm a mesma frequência.");
    }

    public static int encontrarModa(List<Integer> numeros) {
        Map<Integer, Integer> frequencia = new HashMap<>();

        for (int numero : numeros) {
            frequencia.put(numero, frequencia.getOrDefault(numero, 0) + 1);
        }

        int moda = Integer.MIN_VALUE;
        int maxFrequencia = 0;

        for (Map.Entry<Integer, Integer> entry : frequencia.entrySet()) {
            int numero = entry.getKey();
            int freq = entry.getValue();

            if (freq > maxFrequencia) {
                maxFrequencia = freq;
                moda = numero;
            }
        }
        for (Map.Entry<Integer, Integer> entry : frequencia.entrySet()) {
            int freq = entry.getValue();
            if (freq == maxFrequencia && entry.getKey() != moda) {
                return Integer.MIN_VALUE;
            }
        }

        return moda;
    }
}
