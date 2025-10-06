package com.example.hw3.macronutrient_meals.fats;

public class Avocado extends Fats {
    @Override
    public Fats makeFat() {
        return new Avocado();
    }

    @Override
    public String toString() {
        return "Avocado";
    }
}
