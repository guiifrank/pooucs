package br.ucs.poo.aula2.exercicios.ex6;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        People people = new People();

        System.out.println("Informe seu nome: ");
        String x = sc.next();
        people.setName(x);
        System.out.println("Informe sua idade: ");
        int y = sc.nextInt();
        people.setAge(y);

        System.out.println(x + " voce ja viveu " + people.calculaAnos(y) + " dias");

        sc.close();
    }
}
