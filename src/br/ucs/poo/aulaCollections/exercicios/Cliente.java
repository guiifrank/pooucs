package br.ucs.poo.aulaCollections.exercicios;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int id;
    private String name;
    private String telefone;
    private int age;

    List<Cliente> list = new ArrayList<>();

    public boolean addCliente(Cliente cliente) {
       list.add(cliente);
       return true;
    }

    public boolean addFirst(int index, Cliente cliente) {
        list.add(index, cliente);
        return true;
    }

    public boolean removeThird(int index) {
        list.remove(index);
        return true;
    }

    public List<Cliente> getList() {
        return list;
    }

    public Cliente() {
    }

    public Cliente(int id, String name, String telefone, int age) {
        this.id = id;
        this.name = name;
        this.telefone = telefone;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", telefone='" + telefone + '\'' +
                ", age=" + age +
                '}';
    }
}
