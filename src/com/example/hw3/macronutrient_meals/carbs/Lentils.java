package com.example.hw3.macronutrient_meals.carbs;

public class Lentils extends Carbs {
    @Override
    public Carbs makeCarb() {
        return new Lentils();
    }

    @Override
    public String toString() {
        return "Lentils";
    }
}
