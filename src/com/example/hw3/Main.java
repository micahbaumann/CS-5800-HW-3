package com.example.hw3;

import com.example.hw3.macronutrient_meals.MacronutrientDriver;
import com.example.hw3.pizza_and_movies.PizzaDriver;

public class Main {
    public static void main(String[] args) {
        System.out.println("PizzaDriver:");
        System.out.println();
        PizzaDriver.run();
        System.out.println();
        System.out.println();

        System.out.println("MacronutrientDriver:");
        System.out.println();
        MacronutrientDriver.run();
    }
}
