package exerc50java;

public class Exerc01 {
    public static void main(String[] args){
        System.out.println("1)\tEscreva um programa para calcular a soma dos números de 1 a 100.");
        int soma = 0;
        for(int contador = 1; contador <= 100; contador++){
            System.out.println(contador + " + "+ soma + " = "+ (contador+soma));
            soma += contador;
        }
    }
}
