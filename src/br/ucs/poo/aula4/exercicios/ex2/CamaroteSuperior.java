package br.ucs.poo.aula4.exercicios.ex2;

public class CamaroteSuperior extends Vip {
    public CamaroteSuperior(double valor, double valorAdicional) {
        super(valor, valorAdicional);
    }

    public double getValor() {
        return super.getValorVIP();
    }
}
