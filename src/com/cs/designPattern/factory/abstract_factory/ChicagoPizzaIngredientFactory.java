package com.cs.designPattern.factory.abstract_factory;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{

    @Override
    public String createDough() {
        return "Chicago Dough";
    }

    @Override
    public String createSauce() {
        return "Chicago Sauce";
    }

    @Override
    public String createCheese() {
        return "Chicago Cheese";
    }

    @Override
    public String createClam() {
        return "Chicago Clam";
    }
}
