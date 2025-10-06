package com.example.hw3.macronutrient_meals.carbs;

import com.example.hw3.macronutrient_meals.DietPlans;

import java.util.ArrayList;
import java.util.Random;

public class CarbsFactory {
    private static CarbsFactory carbsFactory = null;

    private CarbsFactory() {}

    public static CarbsFactory getInstance() {
        if (carbsFactory == null) {
            carbsFactory = new CarbsFactory();
        }
        return carbsFactory;
    }

    public Carbs makeRandomCarb(DietPlans dietPlans) {
        if (dietPlans == DietPlans.PALEO) {
            return new Pistachio();
        } else {
            Random random = new Random();
            ArrayList<Carbs> carbs = new ArrayList<Carbs>();
            if (dietPlans == DietPlans.NO_RESTRICTION) {
                carbs.add(new Pistachio());
                carbs.add(new Bread());
                carbs.add(new Cheese());
                carbs.add(new Lentils());
            } else if (dietPlans == DietPlans.VEGAN) {
                carbs.add(new Pistachio());
                carbs.add(new Bread());
                carbs.add(new Lentils());
            } else if (dietPlans == DietPlans.NUT_ALLERGY) {
                carbs.add(new Bread());
                carbs.add(new Cheese());
                carbs.add(new Lentils());
            } else {
                return null;
            }

            return carbs.get(random.nextInt(carbs.size()));
        }
    }
}
