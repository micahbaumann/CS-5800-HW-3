package com.example.hw3.pizza_and_movies;

public class Driver {
    public static void run() {
        Pizza pizza1 = new PizzaBuilder("Small").addPepperoni().addExtraCheese().addBacon().buildPizza();
        pizza1.eat();
        System.out.println();

        Pizza pizza2 = new PizzaBuilder("Medium").addBeef().addHamAndPineapple().addChicken().addOnions().addSausage().addTomatoAndBasil().buildPizza();
        pizza2.eat();
        System.out.println();

        Pizza pizza3 = new PizzaBuilder("Large").addSpinach().addSausage().addPesto().addChicken().addExtraCheese().addPepperoni().addHam().addOlives().addBacon().buildPizza();
        pizza3.eat();
        System.out.println();

        // Pizza Hut
        Pizza pizzaHutLarge = new PizzaBuilder("Large").addPesto().addChicken().addExtraCheese().buildPizza();
        pizzaHutLarge.eat();
        System.out.println();

        Pizza pizzaHutSmall = new PizzaBuilder("Small").addOlives().addBacon().buildPizza();
        pizzaHutSmall.eat();
        System.out.println();

        // Little Caesars
        Pizza littleCaesarsMedium = new PizzaBuilder("Medium").setChain("Little Caesars").addSpinach().addSausage().addPesto().addExtraCheese().addPepperoni().addHam().addOlives().addBacon().buildPizza();
        littleCaesarsMedium.eat();
        System.out.println();

        Pizza littleCaesarsSmall = new PizzaBuilder("Small").setChain("Little Caesars").addOlives().addBacon().addSpinach().addSausage().addPesto().addPepperoni().buildPizza();
        littleCaesarsSmall.eat();
        System.out.println();

        // Dominos
        Pizza dominosSmall = new PizzaBuilder("Small").setChain("Dominos").addPepperoni().buildPizza();
        dominosSmall.eat();
        System.out.println();

        Pizza dominosLarge = new PizzaBuilder("Large").setChain("Dominos").addSausage().addPesto().addPepperoni().buildPizza();
        dominosLarge.eat();
        System.out.println();
    }

    public static void main(String[] args) {
        run();
    }
}
