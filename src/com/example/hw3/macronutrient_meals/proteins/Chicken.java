package com.example.hw3.macronutrient_meals.proteins;

public class Chicken extends Proteins {
    @Override
    public Proteins makeProtein() {
        return new Chicken();
    }

    @Override
    public String toString() {
        return "Chicken";
    }
}
