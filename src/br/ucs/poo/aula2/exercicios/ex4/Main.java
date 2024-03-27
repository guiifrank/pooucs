package br.ucs.poo.aula2.exercicios.ex4;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Salary salary = new Salary();

        System.out.println("Informe o salario minimmo: ");
        double y = sc.nextDouble();
        salary.setMinimalSalary(y);
        System.out.println("Informe o seu salario: ");
        double x = sc.nextDouble();
        salary.setAmount(x);


        sc.close();
    }
}
