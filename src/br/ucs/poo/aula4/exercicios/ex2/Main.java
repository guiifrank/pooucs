package br.ucs.poo.aula4.exercicios.ex2;

public class Main {
    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso(50.0);
        ingresso.imprimeValor();

        Vip vip = new Vip(50.0, 20.0);
        System.out.println("Valor do ingresso VIP: R$" + vip.getValorVIP());

        Normal normal = new Normal(30.0);
        normal.imprimeTipo();

        CamaroteInferior camaroteInferior = new CamaroteInferior(80.0, 30.0, "Setor A");
        camaroteInferior.imprimeLocalizacao();

        CamaroteSuperior camaroteSuperior = new CamaroteSuperior(100.0, 50.0);
        System.out.println("Valor do camarote superior: R$" + camaroteSuperior.getValor());
    }
}
