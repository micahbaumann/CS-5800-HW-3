package com.example.hw3.macronutrient_meals.diet_plans;

import com.example.hw3.macronutrient_meals.carbs.*;
import com.example.hw3.macronutrient_meals.fats.*;
import com.example.hw3.macronutrient_meals.proteins.*;

import java.util.ArrayList;
import java.util.Random;

public class Paleo extends DietPlanFactory {
    @Override
    public Carbs makeRandomCarb() {
        return new Pistachio();
    }

    @Override
    public Proteins makeRandomProtein() {
        Random random = new Random();
        ArrayList<Proteins> proteins = new ArrayList<Proteins>();
        proteins.add(new Beef());
        proteins.add(new Chicken());
        proteins.add(new Fish());
        return proteins.get(random.nextInt(proteins.size()));
    }

    @Override
    public Fats makeRandomFat() {
        Random random = new Random();
        ArrayList<Fats> fats = new ArrayList<Fats>();
        fats.add(new Avocado());
        fats.add(new Peanuts());
        fats.add(new Tuna());
        return fats.get(random.nextInt(fats.size()));
    }
}
