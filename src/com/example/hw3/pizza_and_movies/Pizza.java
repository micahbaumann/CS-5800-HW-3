package com.example.hw3.pizza_and_movies;

public class Pizza {
    private boolean pepperoni;
    private boolean sausage;
    private boolean mushrooms;
    private boolean bacon;
    private boolean onions;
    private boolean extraCheese;
    private boolean peppers;
    private boolean chicken;
    private boolean olives;
    private boolean spinach;
    private boolean tomatoAndBasil;
    private boolean beef;
    private boolean ham;
    private boolean pesto;
    private boolean spicyPork;
    private boolean hamAndPineapple;
    private String size;
    private String chain;

    Pizza(String size, String chain, boolean pepperoni, boolean sausage, boolean mushrooms, boolean bacon, boolean onions, boolean extraCheese, boolean peppers, boolean chicken, boolean olives, boolean spinach, boolean tomatoAndBasil, boolean beef, boolean ham, boolean pesto, boolean spicyPork, boolean hamAndPineapple) {
        this.size = size;
        this.chain = chain;
        this.pepperoni = pepperoni;
        this.sausage = sausage;
        this.mushrooms = mushrooms;
        this.bacon = bacon;
        this.onions = onions;
        this.extraCheese = extraCheese;
        this.peppers = peppers;
        this.chicken = chicken;
        this.olives = olives;
        this.spinach = spinach;
        this.tomatoAndBasil = tomatoAndBasil;
        this.beef = beef;
        this.ham = ham;
        this.pesto = pesto;
        this.spicyPork = spicyPork;
        this.hamAndPineapple = hamAndPineapple;
    }

    void eat() {
        System.out.println("Chain: " + this.chain);
        System.out.println("Size: " + this.size);
        System.out.println("Toppings:");

        if (this.pepperoni) System.out.println("    Pepperoni");
        if (this.sausage) System.out.println("    Sausage");
        if (this.mushrooms) System.out.println("    Mushrooms");
        if (this.bacon) System.out.println("    Bacon");
        if (this.onions) System.out.println("    Onions");
        if (this.extraCheese) System.out.println("    Extra Cheese");
        if (this.peppers) System.out.println("    Peppers");
        if (this.chicken) System.out.println("    Chicken");
        if (this.olives) System.out.println("    Olives");
        if (this.spinach) System.out.println("    Spinach");
        if (this.tomatoAndBasil) System.out.println("    Tomato and Basil");
        if (this.beef) System.out.println("    Beef");
        if (this.ham) System.out.println("    Ham");
        if (this.pesto) System.out.println("    Pesto");
        if (this.spicyPork) System.out.println("    Spicy Pork");
        if (this.hamAndPineapple) System.out.println("    Ham and Pineapple");
    }
}
