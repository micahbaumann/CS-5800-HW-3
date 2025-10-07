package com.example.hw3.macronutrient_meals;

import com.example.hw3.macronutrient_meals.carbs.Carbs;
import com.example.hw3.macronutrient_meals.fats.Fats;
import com.example.hw3.macronutrient_meals.proteins.Proteins;

import java.util.ArrayList;

public class MacronutrientDriver {
    public static void run() {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer("Customer 1", DietPlans.NO_RESTRICTION));
        customers.add(new Customer("Customer 2", DietPlans.PALEO));
        customers.add(new Customer("Customer 3", DietPlans.VEGAN));
        customers.add(new Customer("Customer 4", DietPlans.NUT_ALLERGY));
        customers.add(new Customer("Customer 5", DietPlans.NO_RESTRICTION));
        customers.add(new Customer("Customer 6", DietPlans.PALEO));

        MacronutrientAbstractFactory macronutrientFactory = MacronutrientAbstractFactory.getInstance();
        for (Customer customer : customers) {
            Meal meal = generateMeal(customer, macronutrientFactory);
            System.out.println("Customer: " + customer.getName());
            System.out.println("    " + meal);
        }
    }

    public static void main(String[] args) {
        run();
    }

    private static Meal generateMeal(Customer c, MacronutrientAbstractFactory macronutrientFactory) {
        Carbs carbs = macronutrientFactory.makeCarbsFactory().makeRandomCarb(c.getDietPlan());
        Proteins protein = macronutrientFactory.makeProteinsFactory().makeRandomProtein(c.getDietPlan());
        Fats fats = macronutrientFactory.makeFatsFactory().makeRandomFat(c.getDietPlan());
        return new Meal(carbs, protein, fats);
    }
}
