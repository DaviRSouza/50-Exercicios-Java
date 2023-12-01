package exerc50java;

public class Exerc06 {
    public static void main(String [] args){
        System.out.println("6)\tImplemente um algoritmo de ordenação de sua escolha para ordenar um array.");

        int[] array = {10, 2, 5, 3, 4, 9, 7, 8, 6, 1};
        System.out.println("Array antes de ser ordenado em ordem crescente: ");

        lerArray(array);

        System.out.println("Array ordenado em ordem crescente: ");

        for (int i = 1; i < array.length; ++i) {
            int elementoAtual = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > elementoAtual) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = elementoAtual;
            lerArray(array);
        }
    }
    public static void lerArray(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
