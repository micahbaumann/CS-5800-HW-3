package com.example.hw3.macronutrient_meals.fats;

public class Tuna extends Fats {
    @Override
    public Fats makeFat() {
        return new Tuna();
    }

    @Override
    public String toString() {
        return "Tuna";
    }
}
