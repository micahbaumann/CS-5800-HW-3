package com.example.hw3.macronutrient_meals.fats;

public class SourCream extends Fats {
    @Override
    public Fats makeFat() {
        return new SourCream();
    }

    @Override
    public String toString() {
        return "Sour Cream";
    }
}
