package br.ucs.poo.aula2.exercicios.ex4;

public class Salary {
    private double amount;
    private double minimalSalary;

    public Salary() {
    }
    public Salary(double amount) {
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public double getMinimalSalary() {
        return minimalSalary;
    }
    public void setMinimalSalary(double minimalSalary) {
        this.minimalSalary = minimalSalary;
    }
    public double calcularSalario(double x, double y) {
        double total = amount / minimalSalary;
        return total;
    }

}
