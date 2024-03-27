package br.ucs.poo.aula2.exercicios.ex5;

public class Losango {
    private double num1;
    private double num2;

    public Losango() {
    }
    public Losango(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public double getNum1() {
        return num1;
    }
    public void setNum1(double num1) {
        this.num1 = num1;
    }
    public double getNum2() {
        return num2;
    }
    public void setNum2(double num2) {
        this.num2 = num2;
    }
    public double calculaArea(double x, double y) {
        double area = this.num1 * this.num2 / 2;
        return area;
    }
}
