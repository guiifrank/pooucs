package br.ucs.poo.aula1.exercicios;

public class BalancoTrimestral {
    public static void main(String[] args) {
        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;
        int gastoTotal = gastosJaneiro + gastosFevereiro + gastosMarco;
        double mediaMensal = (double) gastoTotal / 3;

        System.out.println("Gasto Total: " + gastoTotal);
        System.out.println("Media mensal: " + mediaMensal);
    }
}
