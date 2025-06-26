package org.example.capgemini;

import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Animal {
    private String name;
    private Date dateOfBirth;

    public String sound(int a){
        return String.valueOf(a);
    }

    public static void main(String[] args) {
        Animal cat = new Animal("Cat", new Date(2023, Calendar.APRIL, 1));
        Animal dog = new Animal("Dog", new Date(2025, Calendar.APRIL, 10));
        Animal owl = new Animal("owl", new Date(2021, Calendar.APRIL, 20));
        List<Animal> animals = List.of(owl, dog, cat);
        List<Animal> collect = animals
                .stream()
                .sorted(Comparator.comparing(Animal::getDateOfBirth))
                .toList();
        Animal animal = collect.get(collect.size() - 1);
        System.out.println(animal.getName() + ": " + animal.getDateOfBirth());
    }

    public Animal(String name, Date dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
