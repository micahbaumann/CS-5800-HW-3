package com.example.hw3.macronutrient_meals.carbs;

public class Bread extends Carbs {
    @Override
    public Carbs makeCarb() {
        return new Bread();
    }

    @Override
    public String toString() {
        return "Bread";
    }
}
