package br.ucs.poo.aula5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Relogio relogio = new Relogio(22, 12, 50);
        Relogio relogio2 = new Relogio();

        System.out.println(relogio.toString());

        relogio.incrementaSegundo();
        System.out.println(relogio.toString());

        relogio.decrementaSegundo();
        System.out.println(relogio.toString());

        relogio.acertaHora(20, 24, 42);
        System.out.println(relogio.toString());

        System.out.println(relogio2.toString());

        input.close();
    }
}
