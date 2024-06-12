package br.ucs.poo.aula7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Test t = new Test();

        float x = -1;
        float y = 2;

        try {
            x = input.nextFloat();
        } catch (InputMismatchException e) {
            input.next();
            System.out.println("O valor informado não é numero!");
        }

        try {
            y = input.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("O valor informado não é numero!");
        }


        float z = t.divide(x, y);
        System.out.println(z);

        input.close();
    }
}
