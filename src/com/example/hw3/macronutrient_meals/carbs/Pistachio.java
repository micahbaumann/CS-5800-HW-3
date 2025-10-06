package com.example.hw3.macronutrient_meals.carbs;

public class Pistachio extends Carbs {
    @Override
    public Carbs makeCarb() {
        return new Pistachio();
    }

    @Override
    public String toString() {
        return "Pistachio";
    }
}
