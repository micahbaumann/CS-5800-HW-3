package com.example.hw3.macronutrient_meals.diet_plans;

import com.example.hw3.macronutrient_meals.carbs.*;
import com.example.hw3.macronutrient_meals.fats.*;
import com.example.hw3.macronutrient_meals.proteins.*;

import java.util.ArrayList;
import java.util.Random;

public class NutAllergy extends DietPlanFactory {
    @Override
    public Carbs makeRandomCarb() {
        Random random = new Random();
        ArrayList<Carbs> carbs = new ArrayList<Carbs>();
        carbs.add(new Bread());
        carbs.add(new Cheese());
        carbs.add(new Lentils());
        return carbs.get(random.nextInt(carbs.size()));
    }

    @Override
    public Proteins makeRandomProtein() {
        Random random = new Random();
        ArrayList<Proteins> proteins = new ArrayList<Proteins>();
        proteins.add(new Beef());
        proteins.add(new Chicken());
        proteins.add(new Fish());
        proteins.add(new Tofu());
        return proteins.get(random.nextInt(proteins.size()));
    }

    @Override
    public Fats makeRandomFat() {
        Random random = new Random();
        ArrayList<Fats> fats = new ArrayList<Fats>();
        fats.add(new Avocado());
        fats.add(new SourCream());
        fats.add(new Tuna());
        return fats.get(random.nextInt(fats.size()));
    }
}
