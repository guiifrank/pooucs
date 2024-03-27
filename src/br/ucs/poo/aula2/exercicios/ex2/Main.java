package br.ucs.poo.aula2.exercicios.ex2;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Horses horses = new Horses();

        System.out.println("Informe quantos cavalos foram comprados: ");
        int x = sc.nextInt();
        horses.setNum(x);

        System.out.println("Numero de ferraduras necessarias: " + horses.calculaFerraduras(x));

        sc.close();
    }
}
