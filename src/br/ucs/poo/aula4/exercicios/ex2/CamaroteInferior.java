package br.ucs.poo.aula4.exercicios.ex2;

public class CamaroteInferior extends Vip{
    private String localizacao;

    public CamaroteInferior(double valor, double valorAdicional, String localizacao) {
        super(valor, valorAdicional);
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return this.localizacao;
    }

    public void imprimeLocalizacao() {
        System.out.println("Localização do ingresso: " + this.localizacao);
    }
}
