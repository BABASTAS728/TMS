package com.example.homeworkarrays.lesson12.homework;

public abstract class Pet {
    private String name;
    private String breed;

    public Pet(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public abstract void printInfo();
}
