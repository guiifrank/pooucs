package br.ucs.poo.aula3.model;

public class Pessoa {
    private String nome;
    private float peso;

    public Pessoa() {
    }

    public Pessoa(String nome, float peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "O nome é " + this.nome + "e pesa " + this.peso + " kg";
    }
}
