package com.example.hw3.macronutrient_meals.proteins;

public class Fish extends Proteins {
    @Override
    public Proteins makeProtein() {
        return new Fish();
    }

    @Override
    public String toString() {
        return "Fish";
    }
}
