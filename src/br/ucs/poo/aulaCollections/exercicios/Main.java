package br.ucs.poo.aulaCollections.exercicios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente();
        Cliente cliente2 = new Cliente();
        Cliente cliente3 = new Cliente();

        cliente.setId(1);
        cliente.setName("Artur");
        cliente.setTelefone("849284284");
        cliente.setAge(20);
        cliente.addCliente(cliente);
        cliente2.setId(2);
        cliente2.setName("Henrique");
        cliente2.setTelefone("7947249");
        cliente2.setAge(25);
        cliente.addCliente(cliente2);
        cliente3.setId(3);
        cliente3.setName("Maria");
        cliente3.setTelefone("893081031");
        cliente3.setAge(32);
        cliente.addFirst(0, cliente3);
        
        System.out.println(cliente.getList());
        cliente.removeThird(2);
        System.out.println(cliente.getList());

        cliente.addOtherList(cliente);
        cliente.addOtherList(cliente2);
        cliente.addOtherList(cliente3);
        System.out.println(cliente.getList2());



        sc.close();
    }
}
