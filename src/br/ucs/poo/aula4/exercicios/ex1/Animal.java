package br.ucs.poo.aula4.exercicios.ex1;

public class Animal {
    private String name;
    private String raca;

    public Animal() {
    }

    public Animal(String raca, String name) {
        this.raca = raca;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String caminha() {
        return getName() + "caminha";
    }
}
