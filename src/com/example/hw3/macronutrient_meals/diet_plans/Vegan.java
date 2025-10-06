package com.example.hw3.macronutrient_meals.diet_plans;

import com.example.hw3.macronutrient_meals.carbs.*;
import com.example.hw3.macronutrient_meals.fats.*;
import com.example.hw3.macronutrient_meals.proteins.*;

import java.util.ArrayList;
import java.util.Random;

public class Vegan extends DietPlanFactory {
    @Override
    public Carbs makeRandomCarb() {
        Random random = new Random();
        ArrayList<Carbs> carbs = new ArrayList<Carbs>();
        carbs.add(new Pistachio());
        carbs.add(new Bread());
        carbs.add(new Lentils());
        return carbs.get(random.nextInt(carbs.size()));
    }

    @Override
    public Proteins makeRandomProtein() {
        return new Tofu();
    }

    @Override
    public Fats makeRandomFat() {
        Random random = new Random();
        ArrayList<Fats> fats = new ArrayList<Fats>();
        fats.add(new Avocado());
        fats.add(new Peanuts());
        return fats.get(random.nextInt(fats.size()));
    }
}
