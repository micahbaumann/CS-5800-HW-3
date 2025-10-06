package com.example.hw3.macronutrient_meals.diet_plans;

import com.example.hw3.macronutrient_meals.carbs.Carbs;
import com.example.hw3.macronutrient_meals.fats.Fats;
import com.example.hw3.macronutrient_meals.proteins.Proteins;

public abstract class DietPlanFactory {
    abstract public Carbs makeRandomCarb();
    abstract public Proteins makeRandomProtein();
    abstract public Fats makeRandomFat();

}
