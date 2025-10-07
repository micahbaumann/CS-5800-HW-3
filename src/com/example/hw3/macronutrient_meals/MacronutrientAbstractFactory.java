package com.example.hw3.macronutrient_meals;

import com.example.hw3.macronutrient_meals.carbs.CarbsFactory;
import com.example.hw3.macronutrient_meals.fats.FatsFactory;
import com.example.hw3.macronutrient_meals.proteins.ProteinsFactory;

public class MacronutrientAbstractFactory {
    private static MacronutrientAbstractFactory macronutrientAbstractFactory = null;

    private MacronutrientAbstractFactory() {}

    public static MacronutrientAbstractFactory getInstance() {
        if (macronutrientAbstractFactory == null) {
            macronutrientAbstractFactory = new MacronutrientAbstractFactory();
        }
        return macronutrientAbstractFactory;
    }

    public CarbsFactory makeCarbsFactory() {
        return CarbsFactory.getInstance();
    }

    public ProteinsFactory makeProteinsFactory() {
        return ProteinsFactory.getInstance();
    }

    public FatsFactory makeFatsFactory() {
        return FatsFactory.getInstance();
    }
}
