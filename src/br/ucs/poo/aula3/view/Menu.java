package br.ucs.poo.aula3.view;

import br.ucs.poo.aula3.model.Carro;
import br.ucs.poo.aula3.model.Pessoa;

import java.util.Scanner;

public class Menu {
    private Scanner sc;
    private Carro car;
    public Menu() {
        this.sc = new Scanner(System.in);
    }
    public static void main(String[] args) {
        Menu m = new Menu();
        int option;

        do {
            m.showMenu();
            option = m.sc.nextInt();

            switch (option) {
                case 1 :
                    m.car = m.createCar();
                    break;
                case 2 :
                    System.out.println("showing car:");
                    System.out.println(m.car);
                    break;
                case 3 :
                    System.out.println("Adding person: ");
                    m.addPerson();
                    break;
                case 4 :
                    System.out.println("Removing person: ");
                    m.removePerson();
                    break;
                case 0 :
                    System.out.println("quitted");
                    m.sc.close();
                    System.exit(0);
                    break;
            }
            System.out.println("press a key to continue");
            m.sc.next();
        } while(option != 0);
    }

    public void showMenu() {
        System.out.println("*********************************");
        System.out.println("1) create a car");
        System.out.println("2) show car");
        System.out.println("3) add person");
        System.out.println("4) remove person");
        System.out.println("0) Quit");
        System.out.println("*********************************");
        System.out.println("select your option: ");
        System.out.println("*********************************");
    }
    private Carro createCar() {
        String name;
        int maxPassangers;
        float maxWeight;

        System.out.println("Car creation");
        System.out.println("Type the car name: ");
        name = this.sc.next();
        System.out.println("How many people the car support: ");
        maxPassangers = this.sc.nextInt();
        System.out.println("Whats the maximum weight the car support: ");
        maxWeight = this.sc.nextFloat();

        Carro car = new Carro(name, maxPassangers, maxWeight);

        return car;
    }
    private Pessoa createPerson() {
        String name;
        float weight;

        System.out.println("Person Creation: ");
        System.out.println("Type the name: ");
        name = this.sc.next();
        System.out.println("Type the weight: ");
        weight = this.sc.nextFloat();

        Pessoa person = new Pessoa();
        person.setNome(name);
        person.setPeso(weight);

        return person;
    }
    private void addPerson() {
        if (this.car == null) {
            System.out.println("Create a car first");
        } else {
            Pessoa person = this.createPerson();
            int resposta = this.car.entrar(person);
            if(resposta == 0) {
                System.out.println("Peso limite alcançado");
            }
            if(resposta == -1) {
                System.out.println("Max number of passengers reached!");
            }
        }
    }
    private void removePerson() {
        if (this.car == null) {
            System.out.println("Create a car first!");
        } else if (this.car.getUltimaPos() == 0) {
            System.out.println("The car is empty!");
        } else {
            System.out.println("Enter the name of the person to remove: ");
            String nameToRemove = this.sc.next();
            boolean personRemoved = false;

            for (int i = 0; i < this.car.getUltimaPos(); i++) {
                if (this.car.getOcupantes()[i].getNome().equals(nameToRemove)) {
                    this.car.remove(this.car.getOcupantes()[i]);
                    personRemoved = true;
                    break;
                }
            }

            if (personRemoved) {
                System.out.println("Passenger removed!");
            } else {
                System.out.println("Person with the given name not found in the car!");
            }
        }
    }
}
