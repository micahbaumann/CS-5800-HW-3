package com.example.hw3.macronutrient_meals.proteins;

public class Tofu extends Proteins {
    @Override
    public Proteins makeProtein() {
        return new Tofu();
    }

    @Override
    public String toString() {
        return "Tofu";
    }
}
