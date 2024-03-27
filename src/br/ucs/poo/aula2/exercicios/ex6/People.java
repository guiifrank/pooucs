package br.ucs.poo.aula2.exercicios.ex6;

public class People {
    private String name;
    private int age;

    public People() {
    }
    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int calculaAnos(int y) {
        int total = this.age * 365;
        return total;
    }
}
