package br.ucs.poo.aula5.exercicios.ex2;

public class TestaPonto {
    public static void main(String[] args) {

        Ponto p1, p2, p3;

        p1 = new Ponto(50, 70);
        p1.desloca(20, 30);
        System.out.println(p1.toString());

        p2 = new Ponto(100, 200);
        p2.desloca(50, 50);
        System.out.println(p2.toString());

        p3 = new Ponto(100, 200);
        p3.desloca("50", "100");
    }
}
