package exerc50java;

import java.util.Scanner;

public class Exerc11 {
    public static void main(String[] args){
        System.out.println("11)\tDesenvolva um programa que converta uma temperatura de Celsius para Fahrenheit.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a temperatura em celcius: ");
        double celsius = sc.nextDouble();

        System.out.println(celsius+"°C é igual a "+((celsius * 9/5) + 32)+"°F");
    }
}
