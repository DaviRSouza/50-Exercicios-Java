package exerc50java;

import java.util.Scanner;

public class Exerc29 {
    public static void main(String[] args) {
        System.out.println("29)	Implemente um programa que calcule o volume de uma esfera. = raio - volume");
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio da esfera: ");
        double raio = sc.nextDouble();

        double volume = calcularVolume(raio);

        System.out.println("O volume da esfera é no valor de: " + volume);

        sc.close();
    }

    static double calcularVolume(double raio) {
        double pi = Math.PI;
        return (4.0 / 3.0) * pi * Math.pow(raio, 3);
    }
}
