package com.example.hw3.macronutrient_meals.fats;

public class Peanuts extends Fats {
    @Override
    public Fats makeFat() {
        return new Peanuts();
    }

    @Override
    public String toString() {
        return "Peanuts";
    }
}
