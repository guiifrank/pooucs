package br.ucs.poo.aula2.exercicios.ex5;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Losango losango = new Losango();

        System.out.println("Informe o primeiro valor: ");
        double x = sc.nextDouble();
        losango.setNum1(x);
        System.out.println("Informe o segundo valor: ");
        double y = sc.nextDouble();
        losango.setNum2(y);

        System.out.println("Valor da area: " + losango.calculaArea(x, y));

        sc.close();
    }
}
