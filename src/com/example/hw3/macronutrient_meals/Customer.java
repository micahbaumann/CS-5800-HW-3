package com.example.hw3.macronutrient_meals;

public class Customer {
    private String name;
    private DietPlans dietPlans;

    public Customer(String name, DietPlans dietPlans) {
        this.name = name;
        this.dietPlans = dietPlans;
    }

    public String getName() {
        return name;
    }

    public DietPlans getDietPlan() {
        return dietPlans;
    }
}
