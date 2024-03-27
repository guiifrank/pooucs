package br.ucs.poo.aula2.exercicios.ex1;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Terreno terreno = new Terreno();

        System.out.println("Informe o lado do terreno: ");
        double x = sc.nextDouble();
        terreno.setLado(x);
        System.out.println("Informe a altura do terreno: ");
        double y = sc.nextDouble();
        terreno.setHeight(y);

        System.out.printf("Area do terreno: " + terreno.calculaArea(x, y));

        sc.close();
    }
}
