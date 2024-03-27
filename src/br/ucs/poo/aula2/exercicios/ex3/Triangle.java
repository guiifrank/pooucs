package br.ucs.poo.aula2.exercicios.ex3;

public class Triangle {
    private double a;
    private double b;

    public Triangle() {
    }
    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double calculaCatetos(double a, double b) {
        double total = this.a + this.b;
        return total;
    }
}
