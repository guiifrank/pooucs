package br.ucs.poo.aula4.exercicios.ex2;

public class Ingresso {
    protected double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public void imprimeValor() {
        System.out.println("Valor do ingresso: R$" + this.valor);
    }

    public double getValor() {
        return this.valor;
    }
}
