package com.example.hw3.pizza_and_movies;

public class PizzaBuilder {
    private boolean pepperoni = false;
    private boolean sausage = false;
    private boolean mushrooms = false;
    private boolean bacon = false;
    private boolean onions = false;
    private boolean extraCheese = false;
    private boolean peppers = false;
    private boolean chicken = false;
    private boolean olives = false;
    private boolean spinach = false;
    private boolean tomatoAndBasil = false;
    private boolean beef = false;
    private boolean ham = false;
    private boolean pesto = false;
    private boolean spicyPork = false;
    private boolean hamAndPineapple = false;
    private String size;
    private String chain = "Pizza Hut";

    PizzaBuilder(String size) {
        this.size = size;
    }

    public PizzaBuilder setChain(String chain) {
        this.chain = chain;
        return this;
    }

    public PizzaBuilder addPepperoni() {
        this.pepperoni = true;
        return this;
    }

    public PizzaBuilder addSausage() {
        this.sausage = true;
        return this;
    }

    public PizzaBuilder addMushrooms() {
        this.mushrooms = true;
        return this;
    }

    public PizzaBuilder addBacon() {
        this.bacon = true;
        return this;
    }

    public PizzaBuilder addOnions() {
        this.onions = true;
        return this;
    }

    public PizzaBuilder addExtraCheese() {
        this.extraCheese = true;
        return this;
    }

    public PizzaBuilder addPeppers() {
        this.peppers = true;
        return this;
    }

    public PizzaBuilder addChicken() {
        this.chicken = true;
        return this;
    }

    public PizzaBuilder addOlives() {
        this.olives = true;
        return this;
    }

    public PizzaBuilder addSpinach() {
        this.spinach = true;
        return this;
    }

    public PizzaBuilder addTomatoAndBasil() {
        this.tomatoAndBasil = true;
        return this;
    }

    public PizzaBuilder addBeef() {
        this.beef = true;
        return this;
    }

    public PizzaBuilder addHam() {
        this.ham = true;
        return this;
    }

    public PizzaBuilder addPesto() {
        this.pesto = true;
        return this;
    }

    public PizzaBuilder addSpicyPork() {
        this.spicyPork = true;
        return this;
    }

    public PizzaBuilder addHamAndPineapple() {
        this.hamAndPineapple = true;
        return this;
    }

    public Pizza buildPizza() {
        return new Pizza(size, chain, pepperoni, sausage, mushrooms, bacon, onions, extraCheese, peppers, chicken, olives, spinach, tomatoAndBasil, beef, ham, pesto, spicyPork, hamAndPineapple);
    }
}
