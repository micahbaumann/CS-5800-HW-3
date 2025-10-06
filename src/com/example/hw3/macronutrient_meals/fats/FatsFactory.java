package com.example.hw3.macronutrient_meals.fats;

import com.example.hw3.macronutrient_meals.DietPlans;

import java.util.ArrayList;
import java.util.Random;

public class FatsFactory {
    private static FatsFactory fatsFactory = null;

    private FatsFactory() {}

    public static FatsFactory getInstance() {
        if (fatsFactory == null) {
            fatsFactory = new FatsFactory();
        }
        return fatsFactory;
    }

    public Fats makeRandomFat(DietPlans dietPlans) {
        Random random = new Random();
        ArrayList<Fats> fats = new ArrayList<Fats>();
        if (dietPlans == DietPlans.NO_RESTRICTION) {
            fats.add(new Avocado());
            fats.add(new Peanuts());
            fats.add(new SourCream());
            fats.add(new Tuna());
        } else if (dietPlans == DietPlans.PALEO) {
            fats.add(new Avocado());
            fats.add(new Peanuts());
            fats.add(new Tuna());
        } else if (dietPlans == DietPlans.VEGAN) {
            fats.add(new Avocado());
            fats.add(new Peanuts());
        } else if (dietPlans == DietPlans.NUT_ALLERGY) {
            fats.add(new Avocado());
            fats.add(new SourCream());
            fats.add(new Tuna());
        } else {
            return null;
        }

        return fats.get(random.nextInt(fats.size()));
    }
}
