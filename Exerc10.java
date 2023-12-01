package exerc50java;

public class Exerc10 {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int elementoBuscado = 12;

        int resultado = buscaBinaria(array, elementoBuscado);

        if (resultado == -1) {
            System.out.println("Elemento não encontrado no array.");
        } else {
            System.out.println("Elemento encontrado na posição: " + resultado);
        }
    }

    public static int buscaBinaria(int[] array, int elemento) {
        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;

            if (array[meio] == elemento) {
                return meio;
            }

            if (array[meio] > elemento) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }

        return -1;
    }
}
