package br.ucs.poo.aula2.exercicios.ex1;

public class Terreno {
    private double lado;
    private double height;

    public Terreno() {
    }
    public Terreno(double lado, double height) {
        this.lado = lado;
        this.height = height;
    }
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public Double calculaArea(double x, double y) {
        double area = lado * height;
        return area;
    }
}
