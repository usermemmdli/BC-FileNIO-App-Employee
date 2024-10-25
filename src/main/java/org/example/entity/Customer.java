package org.example.entity;

public class Customer {
    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public Customer setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Customer setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}'+ " " + super.toString();
    }
}