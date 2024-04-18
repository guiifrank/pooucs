package br.ucs.poo.aula5.exercicios.ex2;

public class Ponto {
    private double x;
    private double y;

    public Ponto() {
    }

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void desloca(double valX, double valY) {
        x = x + valX;
        y = y + valY;
    }

    public void setX(String x) {
        this.x = Double.parseDouble(x);
    }

    public void setY(String y) {
        this.y = Double.parseDouble(y);
    }

    public void desloca(String valX, String valY) {
        x = x + Double.parseDouble(valX);
        y = y + Double.parseDouble(valY);
    }

    @Override
    public String toString() {
        return "x = " + x +
                ", y = " + y;
    }
}
