package com.example.hw3.macronutrient_meals;

import com.example.hw3.macronutrient_meals.carbs.Carbs;
import com.example.hw3.macronutrient_meals.fats.Fats;
import com.example.hw3.macronutrient_meals.proteins.Proteins;

public class Meal {
    private Carbs carbs;
    private Proteins proteins;
    private Fats fats;

    public Meal(Carbs carbs, Proteins proteins, Fats fats) {
        this.carbs = carbs;
        this.proteins = proteins;
        this.fats = fats;
    }

    @Override
    public String toString() {
        return "Meal: " + carbs + ", " + proteins + ", " + fats;
    }
}
