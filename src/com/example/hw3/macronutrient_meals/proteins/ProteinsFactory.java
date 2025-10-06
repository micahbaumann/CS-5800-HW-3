package com.example.hw3.macronutrient_meals.proteins;

import com.example.hw3.macronutrient_meals.DietPlans;

import java.util.ArrayList;
import java.util.Random;

public class ProteinsFactory {
    private static ProteinsFactory proteinFactory = null;

    private ProteinsFactory() {}

    public static ProteinsFactory getInstance() {
        if (proteinFactory == null) {
            proteinFactory = new ProteinsFactory();
        }
        return proteinFactory;
    }

    public Proteins makeRandomProtein(DietPlans dietPlans) {
        if (dietPlans == DietPlans.VEGAN) {
            return new Tofu();
        } else {
            Random random = new Random();
            ArrayList<Proteins> proteins = new ArrayList<Proteins>();
            if (dietPlans == DietPlans.NO_RESTRICTION || dietPlans == DietPlans.NUT_ALLERGY) {
                proteins.add(new Beef());
                proteins.add(new Chicken());
                proteins.add(new Fish());
                proteins.add(new Tofu());
            } else if (dietPlans == DietPlans.PALEO) {
                proteins.add(new Beef());
                proteins.add(new Chicken());
                proteins.add(new Fish());
            } else {
                return null;
            }

            return proteins.get(random.nextInt(proteins.size()));
        }
    }
}
