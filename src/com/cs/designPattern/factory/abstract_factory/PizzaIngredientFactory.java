package com.cs.designPattern.factory.abstract_factory;

public interface PizzaIngredientFactory {
    String createDough();
    String createSauce();
    String createCheese();
    String createClam();
}
