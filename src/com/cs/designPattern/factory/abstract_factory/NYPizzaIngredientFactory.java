package com.cs.designPattern.factory.abstract_factory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{

    @Override
    public String createDough() {
        return "NewYork Dough";
    }

    @Override
    public String createSauce() {
        return "NewYork Sauce";
    }

    @Override
    public String createCheese() {
        return "NewYork Cheese";
    }

    @Override
    public String createClam() {
        return "NewYork Clam";
    }
}
