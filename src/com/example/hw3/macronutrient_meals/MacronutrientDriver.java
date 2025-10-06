package com.example.hw3.macronutrient_meals;

import com.example.hw3.macronutrient_meals.diet_plans.DietPlanFactory;

import java.util.ArrayList;

public class MacronutrientDriver {
    public static void run() {
//        DietPlanFactory dietPlanFactory = MacronutrientFactory.getInstance().createDietPlanFactory();
        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer("Customer 1", DietPlans.NO_RESTRICTION));
        customers.add(new Customer("Customer 2", DietPlans.PALEO));
        customers.add(new Customer("Customer 3", DietPlans.VEGAN));
        customers.add(new Customer("Customer 4", DietPlans.NUT_ALLERGY));
        customers.add(new Customer("Customer 5", DietPlans.NO_RESTRICTION));
        customers.add(new Customer("Customer 6", DietPlans.PALEO));
    }

    public static void main(String[] args) {
        run();
    }
}
