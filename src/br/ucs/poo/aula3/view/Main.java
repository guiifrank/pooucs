package br.ucs.poo.aula3.view;

import br.ucs.poo.aula3.model.Carro;
import br.ucs.poo.aula3.model.Pessoa;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Alex Pereira", 93);
        Pessoa p2 = new Pessoa("Charles Oliveira", 71);
        Pessoa p3 = new Pessoa("Gilbert Burns", 77);
        Pessoa p4 = new Pessoa("Vitor Petrino", 93);
        Pessoa p5 = new Pessoa("Rafael dos anjos", 70);

        Carro c = new Carro("Audi Q5", 5, 500);

        System.out.println("--- ANTES ---");
        System.out.println(c);

        if(c.entrar(p1) == 0) {
            System.out.println("Não é possível entrar");
        }
        if(c.entrar(p2) == 0) {
            System.out.println("Não é possível entrar");
        }
        if(c.entrar(p3) == 0) {
            System.out.println("Não é possível entrar");
        }
        if(c.entrar(p4) == 0) {
            System.out.println("Não é possível entrar");
        }
        if(c.entrar(p5) == 0) {
            System.out.println("Não é possível entrar");
        }

        c.entrar(p1);
        c.entrar(p2);
        c.entrar(p3);

        System.out.println("--- DEPOIS ---");
        System.out.println(c);

    }
}
