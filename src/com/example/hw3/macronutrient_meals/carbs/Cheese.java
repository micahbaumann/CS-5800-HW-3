package com.example.hw3.macronutrient_meals.carbs;

public class Cheese extends Carbs {
    @Override
    public Carbs makeCarb() {
        return new Cheese();
    }

    @Override
    public String toString() {
        return "Cheese";
    }
}
