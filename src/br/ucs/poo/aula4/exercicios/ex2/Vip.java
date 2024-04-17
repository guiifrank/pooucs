package br.ucs.poo.aula4.exercicios.ex2;

public class Vip extends Ingresso{
    private final double valorVip;

    public Vip(double valor, double valorAdicional) {
        super(valor);
        this.valorVip = valorAdicional;
    }

    public double getValorVIP() {
        return this.valor + this.valorVip;
    }
}
