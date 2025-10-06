package com.example.hw3.macronutrient_meals.proteins;

public class Beef extends Proteins {
    @Override
    public Proteins makeProtein() {
        return new Beef();
    }

    @Override
    public String toString() {
        return "Beef";
    }
}
