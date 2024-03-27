package br.ucs.poo.aula2.exercicios.ex2;

public class Horses {
    private int num;

    public Horses() {
    }
    public Horses(int num) {
        this.num = num;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public int calculaFerraduras(int num) {
        int total = this.num * 4;
        return total;
    }
}
