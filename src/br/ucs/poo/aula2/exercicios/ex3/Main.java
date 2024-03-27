package br.ucs.poo.aula2.exercicios.ex3;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangle triangle = new Triangle();

        System.out.println("Informe o valor do primeiro cateto: ");
        double x = sc.nextDouble();
        triangle.setA(x);
        System.out.println("Informe o valor do segundo cateto: ");
        double y = sc.nextDouble();
        triangle.setB(y);
        System.out.println("Valor da hipotenusa: " + triangle.calculaCatetos(x, y));

        sc.close();
    }
}
