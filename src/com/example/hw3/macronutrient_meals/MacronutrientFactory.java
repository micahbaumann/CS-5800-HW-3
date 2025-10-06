package com.example.hw3.macronutrient_meals;

import com.example.hw3.macronutrient_meals.diet_plans.*;
import com.example.hw3.macronutrient_meals.fats.FatsFactory;

public class MacronutrientFactory {
    private static MacronutrientFactory macronutrientFactory = null;

    private MacronutrientFactory() {}

    public static MacronutrientFactory getInstance() {
        if (macronutrientFactory == null) {
            macronutrientFactory = new MacronutrientFactory();
        }
        return macronutrientFactory;
    }

    public DietPlanFactory createDietPlanFactory(DietPlans dietPlanName) {
        if (dietPlanName == DietPlans.NO_RESTRICTION) {
            return new NoRestriction();
        } else if (dietPlanName == DietPlans.PALEO) {
            return new Paleo();
        } else if (dietPlanName == DietPlans.VEGAN) {
            return new Vegan();
        } else if (dietPlanName == DietPlans.NUT_ALLERGY) {
            return new NutAllergy();
        } else {
            System.out.println("Invalid diet plan");
            return null;
        }
    }
}
